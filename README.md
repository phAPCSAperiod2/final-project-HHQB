# Cupcake Clicker

A Java clicker game where players generate cupcakes through clicking and strategic building purchases. The game's main purpose is to provide entertainment to bored students as a game that can run idle as they do schoolwork.

## Overview

Cupcake Clicker challenges players to optimize their cupcake production through a variety of buildings and upgrades. Starting with manual clicking, players unlock increasingly powerful buildings that automatically generate cupcakes over time. Strategic upgrades and multipliers allow for exponential growth and progression through the game.

## Features

- **Manual Clicking**: Generate cupcakes by pressing Space + Enter
- **Multiple Building Types**: 14+ unique buildings with different production rates and costs
  - Clicker, Grandma, Farm, Factory, Bank, Temple, Wizard-Tower, Shipment, Alchemy-Lab, Portal, Time-Machine, Antimatter-Condenser, Prism, Chancemaker, Fractal-Engine, and JavaScript-Console
- **Upgrade System**: Purchase and apply upgrades to boost building efficiency
- **Production Multipliers**: Strategic multipliers increase production rates across different building types
- **Real-time Production**: Buildings automatically generate cupcakes every 5 seconds
- **Interactive CLI**: Command-line interface for game management and building purchases

## Project Structure

```
CSA-FINAL-PROJECT/
├── Main.java              # Entry point for the game
├── Game.java              # Core game logic and state management
├── Building.java          # Building definitions and mechanics
├── Upgrades.java          # Upgrade system and effects
├── Cupcake.java           # Cupcake tracking utility (isnt used sorry)
└── README.md              # This file
```

## Getting Started

### Requirements

- Java 8 or higher
- No external dependencies

### Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/HHQB/CSA-FINAL-PROJECT.git
   cd CSA-FINAL-PROJECT
   ```

2. Compile the Java files:
   ```bash
   javac *.java
   ```

### Running the Game

Execute the main class:
```bash
java Main
```

## How to Play

1. **Start the Game**: Run the Main class to begin
2. **Generate Cupcakes**: Press Space followed by Enter to manually click and generate cupcakes
3. **Purchase Buildings**: Use accumulated cupcakes to purchase buildings that automatically generate cupcakes
4. **Buy Upgrades**: Purchase upgrades to increase building production rates
5. **Progress**: Watch your cupcake production grow exponentially as you unlock more buildings and upgrades

## Game Mechanics

### Cupcake Generation

- **Manual Clicking**: Space + Enter generates cupcakes (affected by click multiplier)
- **Building Production**: Each building generates cupcakes every 5 seconds based on:
  - Building count
  - Base production rate
  - Building-specific multiplier
  - Global production multiplier

### Building Types

Each building has a unique base production rate and upgrade cost. Purchasing additional buildings increases total production. Upgrades further enhance building efficiency through multiplier bonuses.

### Multipliers

The game features a sophisticated multiplier system:
- **Click Multiplier**: Affects manual cupcake generation
- **Production Multiplier**: Global multiplier for all buildings
- **Building-Specific Multipliers**: Individual multipliers for each building type

## Author

HHQB - Computer Science A Final Project

---

**Enjoy playing Cupcake Clicker!** 🧁

