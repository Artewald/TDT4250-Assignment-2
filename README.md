# Project overview
This is my repository for the second assignment in TDT4250. Here I use Ecore modeling to create a domain model for a card based tower defence called "Besieged!", that I have created with a group in TDT4240. I want to make it clear that this domain model only models a part of the game, as modeling the whole game would be way too much work. So in this project I have tried to only focus on modeling the core concepts of the game.

# Domain description
"Besieged!" is a card-based tower defence game featuring multiplayer cooperation, as well as a singleplayer mode. In the game, we have a map defined by tiles, and that contains a path with a start and end, where enemies spawn in waves and progress towards the end. You can place cards on the map and when two cards are placed on top of each other, they combine and become a tower. The game contains variability aspects like: multiple map configurationss, single- and multiplayer modes, and different card and tower types.

# Repository structure
- **Ecore Model and Generated Code**: All Ecore modeling files and generated java-code can be found in the [workspace](./workspace) folder.
  - **Model Files**: [workspace/no.ntnu.tdt4250.besieged.game](./workspace/no.ntnu.tdt4250.besieged.game) contains the Ecore model files.
  - **Editing Tool Code**: [workspace/no.ntnu.tdt4250.besieged.game.edit](./workspace/no.ntnu.tdt4250.besieged.game.edit) contains the code for the editing tool.
  - **Editor Code**: [workspace/no.ntnu.tdt4250.besieged.game.editor](./workspace/no.ntnu.tdt4250.besieged.game.editor) contains the code for the editor.

- **Example Instances**:
  - Example instances of the domain model can be found in the [runtime-EclipseApplication](./runtime-EclipseApplication) folder, where you will find the [no.ntnu.game.examples](./runtime-EclipseApplication/no.ntnu.game.examples) folder/project. [no.ntnu.game.examples](./runtime-EclipseApplication/no.ntnu.game.examples) contains two example instances I've made:
    - [Multiplayer.game](./runtime-EclipseApplication/no.ntnu.game.examples/Multiplayer.game)
    - [Singleplayer.game](./runtime-EclipseApplication/no.ntnu.game.examples/Singleplayer.game)

# Usage instructions
To download and use this project:
1. Clone this repository.
2. Open Eclipse, make sure that you have all the plugins required for the TDT4250 course.
3. Then import all projects from the [workspace](./workspace) folder.

To use the model "plugin" and see the example instances, do the following:
4. Right-click on [no.ntnu.tdt4250.besieged.game](./workspace/no.ntnu.tdt4250.besieged.game).
5. Press "Run as" -> "Eclipse Application".
6. From the new Eclipse window, import the [runtime-EclipseApplication/no.ntnu.game.examples](./runtime-EclipseApplication/no.ntnu.game.examples) project, which containts the example instances.

NOTE: I would like to mention that I have had some trouble with Eclipse, but currently Eclipse, and this project, work prefectly fine on my machine.
