import java.util.Scanner;
import java.lang.Math;

public class atcoder_ABC153_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int h = Integer.parseInt(input[0]);
        int a = Integer.parseInt(input[1]);
        System.out.println((int) Math.ceil((double) h / a));
    }
}