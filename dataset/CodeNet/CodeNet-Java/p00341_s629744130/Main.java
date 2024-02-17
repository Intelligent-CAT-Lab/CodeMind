
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int e = 12;
        int t[] = new int[e];
        for (int i = 0; i < e; i++) {
            t[i] = scanner.nextInt();
        }
        for (int x = 0; x < 11; x++) {
            for (int j = 0; j < 11 - x; j++) {
                if (t[j] < t[j + 1]) {
                    int temp = t[j];
                    t[j] = t[j + 1];
                    t[j + 1] = temp;
                }
            }
        }

        if (t[0] == t[1] && t[1] == t[2] && t[2] == t[3] && t[4] == t[5] && t[5] == t[6] && t[6] == t[7] && t[8] == t[9] && t[9] == t[10] && t[10] == t[11]) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}

