package org.mcproto.main

import io.grpc.Server
import io.grpc.netty.shaded.io.grpc.netty.NettyServerBuilder
import org.bukkit.Bukkit
import org.bukkit.event.Listener
import org.bukkit.plugin.java.JavaPlugin
import org.mcproto.main.util.DebugServerInterceptor
import java.net.InetSocketAddress
import java.util.logging.Logger


class MCProtoPlugin : JavaPlugin(), Listener {
    val service: CommandService = CommandService(this)
    var server: Server? = null
    var debug = false

    companion object {
        // everything in here is static
        val logger : Logger = Bukkit.getLogger()
    }

    override fun onEnable() {
        super.onEnable()
        logger.info { "Plugin wird gestartet..." }
        saveDefaultConfig() // save a copy of the default config.yml if one does not exist

        debug = config.getBoolean("debug")
        val port = config.getInt("port")
        val host = config.getString("host")

        if (debug) { logger.warning { "Plugin im DEBUG Modus!" } }

        logger.info("Versuche an $host:$port zu binden...")
        val address = InetSocketAddress(host, port)
        val serverBuilder = NettyServerBuilder
            .forAddress(address)
            .addService(service)

        if (debug) serverBuilder.intercept(DebugServerInterceptor())
        server = serverBuilder.build()
        server!!.start()
        logger.info { "Bereit: gRPC Server wartet auf Port $host:$port" }
    }

    override fun onDisable() {
        super.onDisable()
        logger.info { "Schalte gRPC Server aus..." }
        server?.shutdown()
        server = null
        logger.info { "Plugin wurde gestoppt!" }
    }
}
