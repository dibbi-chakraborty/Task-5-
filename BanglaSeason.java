import java.util.Scanner;

public class BanglaSeason {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month number (1-12): ");
        int month = sc.nextInt();

        switch (month) {
            case 1, 2:
                System.out.println("Winter");
                break;
            case 3, 4:
                System.out.println("Spring");
                break;
            case 5, 6:
                System.out.println("Summer");
                break;
            case 7, 8:
                System.out.println("Monsoon");
                break;
            case 9, 10:
                System.out.println("Autumn");
                break;
            case 11, 12:
                System.out.println("Late Autumn");
                break;
            default:
                System.out.println("Invalid month number!");
        }
    }
}
