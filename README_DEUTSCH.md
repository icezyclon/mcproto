[English 👈](README.md)

# MCProto Server Plugin

Dieses Minecraft Plugin ist dafür gedacht anderen *Client-Bibliotheken* zu erlauben den Server zu kontrollieren auf dem das Plugin läuft.
Die Client-Bibliotheken können in anderen Programmiersprachen geschrieben sein und so die zwischen-sprachliche Kommunikation zwischen dem Minecraft Java Ökosystem und beliebigen anderen Programmiersprachen zu ermöglichen.
Das Plugin ist für Minecraft Server wie [Spigot](https://www.spigotmc.org/) or [Paper](https://papermc.io/) geschrieben.

Das Plugin wurde vom [RaspberryJuice](https://github.com/zhuowei/RaspberryJuice) Plugin  (und deren Client-Bibliothek [MCPI](https://github.com/martinohanlon/mcpi)) inspiriert versucht deren Konzepte zu nehmen und zu modernisieren um mit neueren Versionen von Minecraft umgehen zu können.

Das Plugin verwendet dabei sogenannte Protocol Buffers und kommuniziert mittels der Bibliothek [gRPC](https://grpc.io/) und deren Protokollen mit den Client-Bibliotheken, die in anderen Programmiersprachen geschrieben wurden.
Das Plugin selbst ist in [Kotlin](https://kotlinlang.org/) geschrieben.

> MCProto befindet sich noch in Arbeit, mit Bugs 🪲 ist zu rechnen!

## Versionen

Die fertig kompilierten und gebundelten jar Dateien können im [Release](https://github.com/icezyclon/mcproto/releases) Abschnitt im Repo heruntergeladen werden.

Die Version des Plugins hat zuerst die *minimale gebrauchte Minecraft Versionsnummer* gefolgt von einer Patch-Nummer.
Normalerweiße kann das Plugin mit neueren Minecraft Versionen ohne Probleme verwendet werden kann.

> Eg. mcproto-1.18.2.X.jar würde Minecraft Version 1.18.2 oder neuer brauchen

Außerdem *sollte* das Plugin mit *älteren* Client-Versionen kompatibel sein.
*Neuere Client-Versionen* werden aber wahrscheinlich nicht mit älteren Versionen des Plugin funktionieren.

TLDR; downloade die neueste Plugin Version

## Client Bibliotheken

Eine Client-Bibliothek erlaubt es dem Client mit dem Server Plugin zu kommunizieren.
[gRPC](https://grpc.io/) lässt zu, dass solche Clients eine [große Auswahl an Programmiersprachen](https://grpc.io/docs/languages/) verwenden können.

Die folgenden Client-Bibliotheken gibt es in den folgenden Sprachen:

* Python: [mcproto-python](https://github.com/icezyclon/mcproto-python)

> Solltest du eine eigene Implementierung des [minecraft.proto](src/main/proto/minecraft.proto) Interfaces schreibst, gib bitte bescheid, sodass ein Link zu der Bibliothek hier inkludiert werden kann!

## Installationsanleitung

Verwende in *gradle* das `shadowJar` Target, welches das fertig gebundelte `jar` Plugin mit allen Abhängigkeiten erstellt.

Ich empfehle *IntelliJ IDEA* (Community) um das Plugin zu bauen und zu bearbeiten.

## Lizenz

[LGPLv3](LICENSE)
