# Jump'n'run
mit Elementen von Grizzy und die Lemminge
## Features
(Features mit ? sind unsicher)
- DKC-ähnliche Steuerung
    - Springen
    - Rollen
        - Luftrolle
    - Bewegen
    - Greifen
    - Auf dem Boden Trommeln
- Lokaler Multiplayer?
- Speichern?
- Level von Datei laden
- Steuerung mit wasd, ijkl
- Levelauswahl-Bildschirmt
- Tutorial


## Ablauf
```mermaid
sequenceDiagram
autonumber
participant M as Main
participant T as Titel
participant D as Oberwelt
participant L as Level
participant C as Controller
participant E as Entities[] 
activate M
loop bis Spieler auf Exit drückt (dann schwierigkeit = 0)
M ->>+ T: anzeigen()
T ->>+ C: input()
C -->>- T: input
T -->>- M: speicherdatei
M ->>+ D: spielen(speicherdatei)
loop bis der Spieler auf beenden drückt
D ->>+ C: input()
C -->>- D: input
D ->>+ L: spielen()
L --) E: new()
loop
L ->>+ C: input()
C -->>- L: input
L ->>+ E: forEach().bewegen()
E -->>- L: a
end
L -->>- D: geschafft?
end
D -->>- M: Beendet
end   
```

```mermaid
classDiagram
class Main {
    void main(List~String~ args)
}

Main --o Titel 

class Titel {
    
}
Main --o Oberwelt

class Oberwelt {
    Level level 
    void spielen()
}

Oberwelt --o Level

class Level {
    Steuerung spieler1
    Steuerung spieler2
    void spielen()
}

Level --o Steuerung

class  Steuerung {
    <<interface>>
    links()
    rechts()
    springen()
    angreifen()
    greifen()
}

class TastaturSteuerung
class ControllerSteuerung
class Audio {
    -hintergrundmusik
    -Vec sfx
    void sfxAbspielen()
    void hintergrundMusik()
}
TastaturSteuerung --|> Steuerung
ControllerSteuerung --|> Steuerung

class Spieler 


```
