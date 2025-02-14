# Assignment-3

## Overview
This repository contains three Java programs demonstrating exception handling in different scenarios.

## Problem Descriptions

### 1. Square Root Calculation (Easy Level)
- Calculates the square root of a number.
- Handles exceptions for negative numbers and non-numeric values.

### 2. ATM Withdrawal System (Medium Level)
- Simulates an ATM withdrawal process.
- Checks for correct PIN and sufficient balance.
- Ensures remaining balance is always displayed.

### 3. University Enrollment System (Hard Level)
- Manages student course enrollment.
- Throws `CourseFullException` if a course is full.
- Throws `PrerequisiteNotMetException` if prerequisites are not completed.

## Project Structure
    Assignment-3/
│── src/
│   ├── SquareRootCalculator.java
│   ├── ATMWithdrawal.java
│   ├── UniversityEnrollmentSystem.java
│── README.md
│── input_output_examples.txt


## Execution Instructions
 Run the following command to compile all Java files:
    --javac src/*.java
Execute each program using the following commands:
    --java src.SquareRootCalculator
    --java src.ATMWithdrawal
    --java src.UniversityEnrollmentSystem
