import java.util.Scanner;

public class SeriesOddSquares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms (n): ");
        int n = sc.nextInt();
        int number = 1;
        int sum = 0;

        System.out.print("Series: ");
        for (int i = 1; i <= n; i++) {
            number = (i * 2) - 1; // odd numbers: 1,3,5,7...
            System.out.print(number * number + " ");
            sum += number * number;
        }
        System.out.println("\nSum of series: " + sum);
    }
}
