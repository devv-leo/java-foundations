# DreamDevs 2.0 Bootcamp by Moniepoint

This repository contains all the tasks and projects in the DreamDevs 2.0 bootcamp by Moniepoint, focusing on Java programming and GCP.

## Project Structure

The source codes in `src/` is a reflection of the files arrangement in [Enum](https://enumverse.com), the LMS used in the bootcamp. For example: `weekendSnacks/` is under Day Three on Enumverse, hence, the file tree below:

```
java-foundations/
├── src/
│   ├── day1/...
│   ├── day2/...
│   ├── day3/
│   │   └── weekendSnacks/
│   │       ├── BackToSender.java # Dispatch rider wage calculator
│   │       ├── Kata.java         # Mathematical operations and check functions
│   │       └── PizzaWahala.java  # Pizza order calculator
│   └── dsa/                      # Data structures and algorithms
├── test/                         # Test directory
│   ├── dsa/                      # DSA tests
│   ├── BackToSenderTest.java     # BackToSender tests
├── .git/                         # Git version control
└── README.md                     # This file
```

## Getting Started

This is an IntelliJ IDEA project. To run the code:

1. Open IntelliJ IDEA
2. File → Open → Select the `java-foundations` directory
3. Wait for the project to load and dependencies to resolve
4. Run any main class or test using the green play button

## Running Tests

Tests are written using JUnit 5. To run all tests:
- Right-click on the `test` directory
- Select "Run All Tests"

## Future Work

As the bootcamp progresses, this repository will grow with more complex algorithms and data structures, web application development, database integration, API development, and a final capstone projects.
