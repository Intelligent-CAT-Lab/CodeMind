import java.util.Scanner;

public class p00387 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] l = input.split(" ");
        int A = Integer.parseInt(l[0]);
        int B = Integer.parseInt(l[1]);
        int kimawasi = B / A;
        if (B % A > 0) {
            kimawasi++;
        }
        System.out.println(kimawasi);
    }
}