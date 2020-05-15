# Diablo-4
this is my final project

Max Crutchfield
05/14/20
Red id: 822330295

This is a game similar to Diablo but my own version of it. Its simply just a game where you enter a dungeon and fighter and boss and the game ends. 
Its a text based adventure game

acceptDefeat class: The game allows the player during the fight to "accept defeat" which is what this class does by 
lowering the health of the player down to 0 which kills you

baseCharacters class: This class is where all the fighting happens. The bulk of this program is in this class
and this is where the player is given their options to fight or crit or give up so on. This is where we get our health and damage and
damage delt and damage taken for the game.

BubblesortUserInput: this class is where Crit comes into the game. Crit is your chance to critically strike the enemy for a powerful shot 
but there is a chance of failing your crit and hitting the target with a weak attack
the sorted list that you choose from is part of the game and that determines if you land your crit or not

ChooseYourFighter class: This class is obviously where you choose your fighter to play as. They are all the same
but the println changes depending on which fighter you select

Diablo class: this class is the game essentially. This is where you play the game and enjoy what all of the classes and methods are coming together to do 

FindFighterIndex class: This class finds the index of the fighter you selected. This is really just
an added feature that some may find interesting 

gameTitle class: This class uses generics to create the title of the game with String and Integers inputs

UnitTests class: this class does not need explaining as it provides test for the methods to make sure the work properly
