import java.util.Scanner;

public class p02639 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] x_list = new int[5];
        for (int i = 0; i < 5; i++) {
            x_list[i] = sc.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            if (x_list[i] == 0) {
                System.out.println(i+1);
            }
        }
    }
}