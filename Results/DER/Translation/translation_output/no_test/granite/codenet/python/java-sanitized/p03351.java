import java.util.Scanner;

public class p03351 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        int c = Integer.parseInt(input[2]);
        int d = Integer.parseInt(input[3]);
        boolean condition1 = Math.abs(a - c) <= d;
        boolean condition2 = Math.abs(a - b) <= d && Math.abs(b - c) <= d;
        boolean condition3 =!condition1 &&!condition2;
        String output = condition3? "Yes" : "No";
        System.out.println(output);
    }
}