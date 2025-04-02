// File: BuggyProgram.java
public class BuggyProgram {
    public static void main(String[] args) {
        String name = null;
        if (name == "John") {  
            System.out.println("Hello John!");
        }

        int[] numbers = {1, 2, 3};
        for (int i = 0; i <= numbers.length; i++) {  
            System.out.println(numbers[i]);
        }

        int x = 10;
        if (x = 5) {  
            System.out.println("X is 5");
        }

        try {
            int result = 10 / 0;  
            System.out.println(result);
        } catch (Exception e) {
            System.out.println("An error occurred.");
        }
    }
}
