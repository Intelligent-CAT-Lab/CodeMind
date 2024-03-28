import java.util.Scanner;

public class p03742 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String output = a > b ? "Alice" : "Brown";
        System.out.println(output);
    }
}