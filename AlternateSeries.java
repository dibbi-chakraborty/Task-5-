import java.util.Scanner;

public class AlternateSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms (n): ");
        int n = sc.nextInt();
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                sum -= i;
            } else {
                sum += i;
            }
        }
        System.out.println("Sum of series: " + sum);
    }
}
