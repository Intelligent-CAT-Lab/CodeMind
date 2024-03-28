import java.util.Scanner;

public class p02570 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int data[] = new int[3];
        data[0] = sc.nextInt();
        data[1] = sc.nextInt();
        data[2] = sc.nextInt();
        if (data[0] / data[1] <= data[2]) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}