import java.util.Scanner;

public class p02570 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] data = new int[3];
        for (int i = 0; i < 3; i++) {
            data[i] = scanner.nextInt();
        }
        if ((double)data[0]/data[1] <= data[2]) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}