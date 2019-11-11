import java.util.Scanner;

public class PartyProfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int companion = Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());

        int earnings = 50 * days;

        for (int i = 1; i <= days ; i++) {

            if (i % 10 == 0) {
                companion -= 2;
            }

            if (i % 15 == 0) {
                companion += 5;
            }

            if (i % 3 == 0) {
                earnings -= 3 * companion;
            }

            if (i % 5 == 0) {
                earnings += 20 * companion;
                if (i % 3 == 0) {
                    earnings -= 2 * companion;
                }
            }

            earnings -= 2 * companion;

        }

        int coinsForEach = earnings / companion;
        System.out.printf("%d companions received %d coins each.", companion, coinsForEach);
    }
}
