public class program5_for {
    public static void main(String[] args) {
        // Example 1
        for (int i = 0; i < 6; i++) {
            System.out.println(i);
        }
        System.out.println();
        // Example 2 - pattern
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
