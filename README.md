[Deutsch 👈](README_DEUTSCH.md)

# MCProto Server Plugin

This Minecraft server plugin is designed to allow other *client libraries* to control the server it is running on. 
These client libraries can be written in other programming languages thus allowing for interoperability between the Java plugin ecosystem and other languages.
The plugin is design to be run on [Spigot](https://www.spigotmc.org/) or [Paper](https://papermc.io/) Minecraft servers.

This plugin is heavily inspired by [RaspberryJuice](https://github.com/zhuowei/RaspberryJuice) (and its client library [MCPI](https://github.com/martinohanlon/mcpi)) and attempts a more modern approach for communication between server and client that also works for more modern versions of Minecraft.

This plugin uses Protocol Buffers and the [gRPC](https://grpc.io/) library and protocols to communicate with clients written in other programming languages and is itself written in [Kotlin](https://kotlinlang.org/).

> MCProto is still a work in progress so except bugs 🪲!

## Versions

You can download the compiled and bundled jars in the [release](https://github.com/icezyclon/mcproto/releases) section of the repository.

The plugin version first includes the *minimum required Minecraft version* followed by a minor version number that gets incremented with patches and additional functionality.
Usually a plugin can always be used with newer Minecraft versions without any problems.

> Eg. mcproto-1.18.2.X.jar would require Minecraft Version 1.18.2 or newer

Additionally, the plugin *should* be compatible with *older* client versions as backwards compatibility should be kept (which is also supported by the protocol buffers).
However, using *newer client* versions with older plugin versions will most likely *not work*.

TLDR; download the newest version of the plugin

## Client Libraries

A client library allows for communication with the server plugin. 
Due to its design [gRPC](https://grpc.io/) allows for implementations in a [large number of programming languages](https://grpc.io/docs/languages/).

The following client implementations exists for the following languages:

* Python: [mcproto-python](https://github.com/icezyclon/mcproto-python)

> If you implement your own client for the [minecraft.proto](src/main/proto/minecraft.proto) interface, please let me know so that I can add a link to this list!

## Build Instructions

Using *gradle* run the `shadowJar` target, which will build a bundled `jar` plugin with all dependencies included.

I personally recommend *IntelliJ IDEA* (Community) to build and program the plugin.

## License

[LGPLv3](LICENSE)
