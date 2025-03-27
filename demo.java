// File: BuggyProgram.java
public class BuggyProgram {
    public static void main(String[] args) {
        String name = null;
        if (name == "John") {  // ❌ Bug: Use .equals() instead of ==
            System.out.println("Hello John!");
        }

        int[] numbers = {1, 2, 3};
        for (int i = 0; i <= numbers.length; i++) {  // ❌ Bug: Index out of bounds (should be < instead of <=)
            System.out.println(numbers[i]);
        }

        int x = 10;
        if (x = 5) {  // ❌ Bug: Assignment instead of comparison (should be x == 5)
            System.out.println("X is 5");
        }

        try {
            int result = 10 / 0;  // ❌ Bug: Division by zero
            System.out.println(result);
        } catch (Exception e) {
            System.out.println("An error occurred.");
        }
    }
}
