package com.mycompany.queueses;

import java.util.Scanner;

public class Queueses {

    private final int[] queueArray;
    private final int maxSize;
    private int front;
    private int rear;
    private int currentSize;

    public Queueses(int size) {
        maxSize = size;
        queueArray = new int[maxSize];
        front = 0;
        rear = -1;
        currentSize = 0;
    }

    public void enqueue(int value) {
        if (currentSize == maxSize) {
            System.out.println("");
            System.out.println("The Queue is full. Cannot enqueue.");
            return;
        }
        rear = (rear + 1) % maxSize;
        queueArray[rear] = value;
        currentSize++;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("");
            System.out.println("The Queue is empty. Cannot dequeue.");
            return -1;
        }
        int removedValue = queueArray[front];
        front = (front + 1) % maxSize;
        currentSize--;
        return removedValue;
    }

    public boolean isEmpty() {
        return currentSize == 0;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("");
            System.out.println("The Queue is empty. Cannot peek.");
            return -1;
        }
        return queueArray[front];
    }

    public int size() {
        return currentSize;
    }

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Please Enter the size of the queue: ");

            int size = 0;
            while (size <= 0) {
                if (input.hasNextInt()) {
                    size = input.nextInt();
                    if (size <= 0) {
                        System.out.println("The Queue size must be a positive integer. Please try again.");
                    }
                } else {
                    System.out.println("Invalid input. Please enter a positive integer.");
                    input.next();
                }
            }

            Queueses customQueue = new Queueses(size);

            System.out.print("Please Enter elements to enqueue (Space Separated): ");
            input.nextLine();
            String[] elements = input.nextLine().split(" ");

            for (String element : elements) {
                try {
                    int value = Integer.parseInt(element);
                    customQueue.enqueue(value);
                } catch (NumberFormatException e) {
                }
            }

            System.out.println("Front element: " + customQueue.peek());
            System.out.println("Queue size: " + customQueue.size());

            System.out.println("Dequeued element: " + customQueue.dequeue());

            System.out.println("");
            System.out.println("Is the Queue empty?: " + (customQueue.isEmpty() ? "True" : "False"));

            System.out.println("Front element: " + customQueue.peek());
        }
    }
}
