import java.util.Scanner;

public class p00310 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int p = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);
        int c = Integer.parseInt(input[2]);
        System.out.println(p + m + c);
    }
}