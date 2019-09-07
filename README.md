# Java Projekt-Template fuer OOP/PLAB, PRG, AD und SWDE

[![build status](https://intern-gitlab.enterpriselab.ch/oop/oop_maven_template/badges/develop/build.svg)](https://intern-gitlab.enterpriselab.ch/oop/oop_maven_template/commits/develop)
[![Quality Gate](http://docker-2017-zbgisler.el.eee.intern:9000/api/badges/gate?key=ch.hslu:oop_maven_template)](http://docker-2017-zbgisler.el.eee.intern:9000/dashboard?id=ch.hslu%3Aoop_maven_template)
[![Coverage](http://docker-2017-zbgisler.el.eee.intern:9000/api/badges/measure?key=ch.hslu:oop_maven_template&metric=coverage)](http://docker-2017-zbgisler.el.eee.intern:9000/component_measures?id=ch.hslu%3Aoop_maven_template&metric=coverage)
[![Test Success](http://docker-2017-zbgisler.el.eee.intern:9000/api/badges/measure?key=ch.hslu:oop_maven_template&metric=test_success_density)](http://docker-2017-zbgisler.el.eee.intern:9000/component_measures?id=ch.hslu%3Aoop_maven_template&metric=test_success_density)

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
