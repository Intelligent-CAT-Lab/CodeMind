import java.util.Scanner;

public class p03265 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int s = Integer.parseInt(input[1]);
        int d = Integer.parseInt(input[2]);
        int f = Integer.parseInt(input[3]);

        int x3 = d - f + s;
        int y3 = f + d - a;
        int x4 = a - f + s;
        int y4 = s + d - a;

        System.out.println(x3 + " " + y3 + " " + x4 + " " + y4);
    }
}