# Java Projekt-Template für OOP

## Zweck
Dieses Projekt dient im Modul OOP als Template für einfache Java-Projekte.
Es nutzt einen auf Apache Maven basierenden (und somit IDE-unabhängigen) 
Build und verwendet die eine entsprechende Verzeichnisstruktur. 

## Verwendung
Das Projekt kann einfach kopiert und umbenannt werden. In den meisten 
IDE's kann es direkt geöffnet werden, sofern diese in der Lage sind 
Maven-POMs (Apache Maven) zu interpretieren.

Nach dem Kopieren in ein neues Verzeichnis empfehlen wir ihnen, den Namen
des Verzeichnisses, den Namen des Projektes in der IDE, und die "ArtifactID"
(ein Element im pom.xml) synchron zu halten. In den meisten IDE's erreichen
Sie das durch ein einfaches "Rename"-Refactoring, können das aber auch
"von Hand" erledigen.

Sobald Sie eigene Klassen und Testfälle ergänzt haben sollten Sie die 
enthaltenen Demo-Klassen entfernen.

## Enhaltene Libraries (Dependencies)
* Logging Framework - http://logging.apache.org/log4j/2.x/
* JUnit - http://junit.org/junit4/
* Hamcrest - http://hamcrest.org/JavaHamcrest/
* EqualsVerifier - http://jqno.nl/equalsverifier/
* MutabilityDetector - http://mutabilitydetector.org/

## Integrierte Analysewerkzeuge
* Checkstyle - http://checkstyle.sourceforge.net/
* Findbugs - http://findbugs.sourceforge.net/
* PMD - https://pmd.github.io/
* JaCoCo - http://www.eclemma.org/jacoco/