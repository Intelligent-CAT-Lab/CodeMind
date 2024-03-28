import java.util.Scanner;

public class atcoder_ABC169_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        String b = input[1].substring(0, 1) + input[1].substring(2);
        int a = Integer.parseInt(input[0]);
        int b1 = Integer.parseInt(b);
        System.out.println(a * b1 / 100);
    }
}