import java.util.Scanner;

public class p03481 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] n = sc.nextLine().split(" ");
        int X = Integer.parseInt(n[0]);
        int Y = Integer.parseInt(n[1]);
        int k = (int) (Math.log(Y / X) / Math.log(2)) + 1;
        System.out.println(k);
    }
}