# 4by4sudokusolver
A Simple 4x4 Sudoku Solver in Java

## Project Overview
A simple console-based 4x4 Sudoku Solver developed using Java.
The program accepts a partially completed Sudoku puzzle, validates
the given values, and solves the puzzle using the backtracking
algorithm.

## Features
- 4x4 Sudoku board
- User input using Scanner
- Input validation
- Row, column, and 2x2 box validation
- Backtracking-based Sudoku solving
- Exception handling for invalid input
- Modular Java class structure

## Technologies
- Java
- Object-Oriented Programming
- Arrays
- Recursion
- Exception Handling

## Project Structure
src/
- Main.java
- SudokuBoard.java
- InputHandler.java
- SudokuValidator.java
- SudokuSolver.java
- SudokuException.java

## How to Run

Open a terminal inside the project folder.

Compile:
javac src/*.java

Run:
java -cp src Main

## Input
Enter four rows. Each row must contain four integers.
Use 0 for an empty cell.

Example:
0 2 0 4
0 0 1 0
0 0 4 0
2 0 0 1

## Algorithm
The solver uses backtracking:
1. Find an empty cell.
2. Try numbers from 1 to 4.
3. Check whether the number is safe.
4. Place the number if valid.
5. Recursively solve the remaining cells.
6. If the choice leads to failure, remove it and try another number.
7. Continue until the puzzle is solved or no solution exists.

