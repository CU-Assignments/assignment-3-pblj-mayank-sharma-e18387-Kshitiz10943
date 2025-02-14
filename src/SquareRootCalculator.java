import java.util.Scanner;

class SquareRootCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        
        try {
            double a = sc.nextDouble();
            if (a < 0) {
                System.out.println("Error: Cannot calculate the square root of a negative number.");
            } else {
                System.out.println("Square root: " + Math.sqrt(a));
            }
        } catch (Exception e) {
            System.out.println("Error: Invalid input. Please enter a numeric value.");
        }
        
        sc.close();
    }
}