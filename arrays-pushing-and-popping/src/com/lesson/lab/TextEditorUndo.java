package com.lesson.lab;

public class TextEditorUndo {
    private String[] stack;
    private int top;

    // Constructor to initialize the stack and top index
    public TextEditorUndo(int size) {
        stack = new String[size];
        top = -1;
    }

    // Method to add a new action to the stack
    public void push(String action) {
        if (top == stack.length - 1) {
            System.out.println("Undo stack is full. Cannot add more actions.");
        } else {
            stack[++top] = action;
            System.out.println("Action \"" + action + "\" added to undo stack.");
        }
    }
    // Method to remove and return the most recent action from the stack
    public String pop() {
        if (top == -1) {
            System.out.println("Undo stack is empty. No action to undo.");
            return null;
        } else {
            String action = stack[top--];
            System.out.println("Undone action: \"" + action + "\"");
            return action; // Return the undone action
        }
    }
    // Method to view the most recent action in the stack without removing it
    public String peek() {
        if (top == -1) {
            System.out.println("Undo stack is empty. No action to show.");
            return null;
        } else {
            return stack[top];
        }
    }

    // Method to display all actions in the stack
    public void display() {
        // TODO 14: Check if the stack is empty

        // TODO 15: Print message if the stack is empty

        // TODO 16: Iterate through the stack and print each action

        // TODO 17: Print a new line after displaying all actions
    }
}