import java.util.Scanner;

public class p02786 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int H = scanner.nextInt(); // Gets input

        int ans = attack(H);
        System.out.println(ans); // Prints the output
        scanner.close();
    }

    public static int attack(int tairyoku) {
        if (tairyoku == 1) {
            return 1;
        } else {
            return 1 + attack(tairyoku / 2) * 2;
        }
    }
}