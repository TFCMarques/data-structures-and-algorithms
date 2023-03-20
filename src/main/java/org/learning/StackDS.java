package org.learning;

import java.util.Stack;

public class StackDS {
    // Last In First Out (LIFO) data structure
    // Stores objects into a sort of vertical tower
    // Example: a stack of video games

    // push() to add to the top of the stack
    // pop() to remove from the top

    public static void call() {
        Stack<String> stack = new Stack<String>();

        // System.out.println(stack.empty()); = true

        stack.push("Minecraft");
        stack.push("Skyrim");
        stack.push("Doom");
        stack.push("Tetris");

        // System.out.println(stack.empty()); = false

        System.out.println(stack); // [Minecraft, Skyrim, Doom, Tetris]

        String gameAtTheTop = stack.peek(); // Checks the object at the top of the stack
        System.out.println(gameAtTheTop); // = Tetris

        int gamePosition = stack.search("Minecraft"); // Returns position starting from 1 at the bottom
        System.out.println("Minecraft is in position: " + gamePosition);

        //System.out.println(stack.search("Rust")); = -1 (Not found)

        stack.pop(); // Removes Tetris
        stack.pop(); // Removes Doom

        // System.out.println(stack.empty()); = false

        System.out.println(stack);

        stack.pop(); // Removes Skyrim
        String lastGame = stack.pop(); // Removes Minecraft and sets the variable

        System.out.println("Last game: " + lastGame);

        // System.out.println(stack.empty()); = true

        // for(int i = 0; i < 1_000_000_000; i++) { stack.push("Bananas"); }
        // Exception in thread "main" java.lang.OutOfMemoryError: Java heap space
        // Due to Java's Heap size, you can't have "infinite" items in a stack

        // Uses for Stacks (examples):
        // 1. Undo/Redo features in text editors
        // 2. Moving back/forward through browser history
        // 3. Backtracking algorithms (maze, file directories)
        // 4. calling functions (call stack)
    }
}
