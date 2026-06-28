# Chess System Java

A terminal-based chess game developed in **Java**, focused on Object-Oriented Programming, clean package organization, and implementation of the main rules of chess.

This project allows two local players to play a full chess match directly in the console. It handles turn control, movement validation, captured pieces, check detection, checkmate detection, and special chess moves.

## About the Project

This project was developed as a practical Java study project. The main goal was to model a real chess match using Object-Oriented Programming concepts such as abstraction, encapsulation, inheritance, polymorphism, and exception handling.

The application uses a layered structure, separating generic board game logic from chess-specific rules. Players interact with the game through the terminal by typing chess positions such as `e2` and `e4`.

## Features

- 8x8 chess board displayed in the terminal.
- Movement rules for all chess pieces.
- Source and target position validation.
- Automatic turn switching between White and Black.
- Captured pieces display.
- Highlighting of possible moves before selecting the target position.
- Check detection.
- Checkmate detection.
- Special moves support:
  - Kingside castling.
  - Queenside castling.
  - En passant.
  - Pawn promotion.
- Custom exception handling for invalid board and chess operations.
- Simple console interface with ANSI colors.

## Technologies Used

- Java
- Object-Oriented Programming
- Terminal / Console application
- ANSI colors for console output

## Java Concepts Practiced

This project was created to practice important Java and software design concepts, including:

- Classes and objects
- Encapsulation
- Inheritance
- Polymorphism
- Abstract classes
- Enumerations
- Lists
- Matrices
- Exception handling
- Package organization
- Separation of responsibilities
- Domain modeling

## Project Structure

```text
src/
├── application/
│   ├── Program.java
│   └── UI.java
├── boardgame/
│   ├── Board.java
│   ├── BoardException.java
│   ├── Piece.java
│   └── Position.java
└── chess/
    ├── ChessException.java
    ├── ChessMatch.java
    ├── ChessPiece.java
    ├── ChessPosition.java
    ├── Color.java
    └── pieces/
        ├── Bishop.java
        ├── King.java
        ├── Knight.java
        ├── Pawn.java
        ├── Queen.java
        └── Rook.java
```

## Main Packages

### `application`

Contains the application entry point and user interface logic.

- `Program.java`: main class responsible for running the game loop, reading player moves, and calling the chess match rules.
- `UI.java`: responsible for printing the board, reading chess positions, displaying captured pieces, and handling terminal colors.

### `boardgame`

Contains generic board game structures that are not specific to chess.

- `Board.java`: represents the board and manages piece placement, removal, and access.
- `Piece.java`: abstract base class for board pieces.
- `Position.java`: represents an internal matrix position.
- `BoardException.java`: custom exception for board-related errors.

### `chess`

Contains chess-specific rules and domain classes.

- `ChessMatch.java`: controls the match, turns, current player, check, checkmate, promotion, castling, and en passant.
- `ChessPiece.java`: base class for all chess pieces.
- `ChessPosition.java`: converts chess notation such as `a1` into internal matrix positions.
- `Color.java`: enum representing piece colors.
- `ChessException.java`: custom exception for chess rule violations.

### `chess.pieces`

Contains the concrete chess piece classes:

- `King`
- `Queen`
- `Rook`
- `Bishop`
- `Knight`
- `Pawn`

Each piece implements its own movement logic through the `possibleMoves()` method.

## How to Run

### Prerequisites

You need to have the **JDK** installed on your machine.

Recommended:

- JDK 17 or higher
- IntelliJ IDEA, Eclipse, VS Code, or another Java IDE/editor

To check if Java is installed, run:

```bash
java -version
javac -version
```

## Running with IntelliJ IDEA

1. Open the project in IntelliJ IDEA.
2. Wait for the IDE to recognize the project structure.
3. Open the following file:

```text
src/application/Program.java
```

4. Run the `main` method.


## How to Play

When the program starts, the chess board will be displayed in the terminal.

The game first asks for the source position:

```text
Source: e2
```

Then it asks for the target position:

```text
Target: e4
```

Positions must follow standard chess notation:

```text
a1, b1, c1 ... h8
```

Example move:

```text
Source: e2
Target: e4
```

If the move is invalid, the system displays an error message and asks for a new move.

## Example Output

```text
8 R N B Q K B N R
7 P P P P P P P P
6 - - - - - - - -
5 - - - - - - - -
4 - - - - - - - -
3 - - - - - - - -
2 P P P P P P P P
1 R N B Q K B N R
  a b c d e f g h

Captured pieces:
White: []
Black: []

Turn: 1
Waiting player: WHITE
Source:
```

The visual appearance may vary depending on the terminal, especially because of ANSI color support.

## Implemented Chess Rules

The project implements the main rules of chess:

- Basic movement for all pieces.
- Capturing opponent pieces.
- Prevention of invalid moves.
- Prevention of moves that leave the player's own king in check.
- Check.
- Checkmate.
- Castling.
- En passant.
- Pawn promotion to Bishop, Knight, Rook, or Queen.

## What I Learned

This project helped me practice how to model a system with well-defined rules and responsibilities. It was also useful to improve my understanding of inheritance, polymorphism, exception handling, matrix-based logic, and how to separate generic board game behavior from specific chess rules.
