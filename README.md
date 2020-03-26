# Java Projekt-Template fuer OOP/PLAB, PRG, AD und SWDE

[![Java CI](https://github.com/rgisler/hslu_maven_template/workflows/Java%20CI/badge.svg)](https://github.com/rgisler/hslu_maven_template/actions?query=workflow%3A%22Java+CI%22)
[![Dependabot](https://flat.badgen.net/dependabot/rgisler/hslu_maven_template?icon=dependabot)](https://dependabot.com/)

## Achtung das ist nur eine "Bridge"-Projekt, das Original ist auf HSLU GitLab

## Zweck
Dieses Projekt dient in den Modulen OOP/PLAB, PRG, AD, SWDE, VSK und APPE als Template fuer 
einfache Java-Projekte. Es nutzt einen auf Apache Maven basierenden (und somit IDE-unabhaengigen) 
Build und definiert die dafür notwendige, standardisierte Verzeichnisstruktur. 

## Verwendung
Das Projekt kann einfach kopiert und umbenannt werden. In den meisten 
IDEs (Eclipse, Netbeans, IntelliJ IDEA etc.) kann es direkt geoeffnet werden, sofern 
diese in der Lage sind Maven-POMs zu interpretieren.
**ACHTUNG**: Dieses Template benoetigt mindestens Java 11! Fuer aeltere Java Versionen (1.8) nutzen 
Sie bitte ein Template auf der Basis von Version 1.5.x

Nach dem Kopieren in ein neues Verzeichnis empfehlen wir, den Namen
des Verzeichnisses, den Namen des Projektes in der IDE und die "ArtifactID"
(ein Element im pom.xml) **synchron** zu halten. In den meisten IDEs erreichen
Sie das durch ein einfaches "Rename"-Refactoring, koennen das aber auch
"von Hand" erledigen.

Sobald Sie eigene Klassen und Testfaelle ergaenzt haben, sollten Sie die 
fuer Demozwecke enthaltenen Demo-Klassen entfernen.

## Enhaltene Libraries (Dependencies)
* JUnit 5 - https://junit.org/junit5/
* JUnit Pioneer - https://junit-pioneer.org/
* AssertJ - http://joel-costigliola.github.io/assertj/
* EqualsVerifier - http://jqno.nl/equalsverifier/
* Logging Framework - http://logging.apache.org/log4j/2.x/

## Integrierte Analysewerkzeuge
* Checkstyle - http://checkstyle.sourceforge.net/
* PMD - https://pmd.github.io/
* JaCoCo - http://www.eclemma.org/jacoco/
* Spotbugs - https://github.com/spotbugs/
