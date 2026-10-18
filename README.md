# Queueses

A Java console application that demonstrates how to implement a **circular queue using an integer array**. The project illustrates fundamental queue operations, including enqueueing, dequeueing, peeking at the front element, checking whether the queue is empty, and retrieving its current size.

## Overview

A queue is a data structure that follows the **First In, First Out (FIFO)** principle. The first element added to the queue is the first element removed.

This project implements a fixed-capacity circular queue. It uses an array and wraps the front and rear positions around to the beginning when they reach the end of the array.

## Features

- **Enqueue:** Adds an integer to the rear of the queue.
- **Dequeue:** Removes and returns the front element.
- **Peek:** Retrieves the front element without removing it.
- **Check Empty:** Determines whether the queue contains any elements.
- **Get Size:** Returns the current number of elements.
- **Capacity Validation:** Requires a positive integer for the queue's capacity.
- **Overflow Handling:** Displays a message when attempting to add an element to a full queue.
- **Underflow Handling:** Displays a message when attempting to remove or inspect an element from an empty queue.

## Technologies Used

- Java 21
- Maven
- Java `Scanner` for console input
- Integer arrays for queue storage

## Project Structure

```text
Queueses/
├── src/
│   └── main/
│       └── java/
│           └── com/
│               └── mycompany/
│                   └── queueses/
│                       └── Queueses.java
├── target/       # Maven build output
├── pom.xml       # Maven project configuration
├── nbactions.xml # IDE-specific Maven actions
└── README.md
```

## Requirements

- JDK 21 or compatible Java 21 development environment
- Apache Maven, or an IDE with Maven support

## Getting Started

### 1. Clone the repository

```bash
git clone https://github.com/ichiroyamazaki/Queueses.git
cd Queueses
```

### 2. Compile the project

```bash
mvn compile
```

### 3. Run the application

```bash
mvn exec:java
```

The Maven configuration specifies `com.mycompany.queueses.Queueses` as the main class.

## How It Works

1. The program asks the user to enter the queue's maximum capacity.
2. It validates that the capacity is a positive integer.
3. The user enters space-separated integer elements.
4. The program attempts to enqueue each valid integer until the queue is full.
5. It displays the front element and the current queue size.
6. It dequeues one element and displays the result.
7. It checks whether the queue is empty and displays the front element again.

### Example

For a queue capacity of `3` and input elements `10 20 30`:

```text
Please Enter the size of the queue: 3
Please Enter elements to enqueue (Space Separated): 10 20 30
Front element: 10
Queue size: 3
Dequeued element: 10
Is the Queue empty?: False
Front element: 20
```

This example illustrates the expected output for the stated input.

## Implementation Details

The `Queueses` class maintains the following state:

| Variable | Purpose |
|---|---|
| `queueArray` | Stores the integer elements |
| `maxSize` | Defines the queue's capacity |
| `front` | Tracks the front position |
| `rear` | Tracks the rear position |
| `currentSize` | Tracks the number of stored elements |

Circular indexing is implemented using modulo arithmetic, allowing the queue to reuse array positions as elements are removed.

## Limitations

- The queue stores integers only.
- The capacity is fixed when the queue is created.
- The console demonstration performs one dequeue operation rather than providing a continuous interactive menu.
- Invalid element strings are silently ignored.
- Empty-queue operations return `-1`, which can be confused with a legitimate stored value of `-1`.

## Author

**Ichiro Yamazaki**

GitHub: https://github.com/ichiroyamazaki

## License

No license has been verified. Check the repository for licensing information before redistributing or modifying the project.
