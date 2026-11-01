import java.util.Scanner;

public class hello {
    static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("enter imput:");

        int n = Integer.parseInt(input.nextLine());

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
        System.out.println();
        System.out.println();
        System.out.println("thank you");



    }
}
