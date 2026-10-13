import java.util.Random;
import java.util.Scanner;
public class Lottery {
    public static void main(String[] args) {
        int[] lottery = new int[5];
        int[] user = new int[5];
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        for (int i = 0; i < 5; i++) {
            lottery[i] = r.nextInt(10);
        }
        System.out.println(" 5 Digit Lottery ");
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter digit " + (i + 1) + ": ");
            while (!s.hasNextInt()) {
                System.out.print("Enter 0-9 only: ");
                s.next(); 
            }
            int input = s.nextInt();
            while (input < 0 || input > 9) {
                System.out.print("Enter 0-9 only: ");
                while (!s.hasNextInt()) {
                    System.out.print("Enter 0-9 only: ");
                    s.next();
                }
                input = s.nextInt();
            }
            
            user[i] = input;
        }
        int matchCount = 0;
        System.out.print("\nLottery numbers: ");
        for (int val : lottery) {
            System.out.print(val + " ");
        }
        System.out.print("\nYour numbers:    ");
        for (int val : user) {
            System.out.print(val + " ");
            if (user[matchCount] == lottery[matchCount]) {
                matchCount++;
            }
        }
        System.out.println("\nMatching digits: " + matchCount);
        if (matchCount == 5) {
            System.out.println("Congratulations, you won hte grand prize ");
        }
    }
}
