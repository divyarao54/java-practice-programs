public class program3_if {
    public static void main(String[] args) {

        // Example 1
        if (10 < 20) {
            System.out.println("20 is greater than 10");
        }

        // Example 2
        int marks = 65;

        if (marks < 50) {
            System.out.println("Fail :(");
        }

        else if (marks >= 50 && marks < 60) {
            System.out.println("D Grade");
        }

        else if (marks >= 60 && marks < 70) {
            System.out.println("C Grade");
        }

        else if (marks >= 70 && marks < 80) {
            System.out.println("B Grade");
        }

        else if (marks >= 80 && marks < 90) {
            System.out.println("A Grade");
        }

        else if (marks >= 90 && marks < 100) {
            System.out.println("S Grade");
        }

        else {
            System.out.println("Invalid marks");
        }

        // Example 3
        int num = -5;

        if (num > 0) {
            System.out.println("Positive number");
        } else if (num == 0) {
            System.out.println("Zero");
        } else {
            System.out.println("Negative number");
        }
    }
}
