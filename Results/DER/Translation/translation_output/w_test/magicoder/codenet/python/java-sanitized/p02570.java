import java.util.Scanner;

public class p02570 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int data0 = Integer.parseInt(input[0]);
        int data1 = Integer.parseInt(input[1]);
        int data2 = Integer.parseInt(input[2]);

        if ((double) data0 / data1 <= data2) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}