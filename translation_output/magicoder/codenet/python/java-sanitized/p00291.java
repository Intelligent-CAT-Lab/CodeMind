import java.util.Scanner;

public class p00291 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");

        int c1 = Integer.parseInt(input[0]);
        int c5 = Integer.parseInt(input[1]);
        int c10 = Integer.parseInt(input[2]);
        int c50 = Integer.parseInt(input[3]);
        int c100 = Integer.parseInt(input[4]);
        int c500 = Integer.parseInt(input[5]);

        int sum = c1 + c5*5 + c10*10 + c50*50 + c100*100 + c500*500;

        System.out.println(sum >= 1000 ? 1 : 0);
    }
}