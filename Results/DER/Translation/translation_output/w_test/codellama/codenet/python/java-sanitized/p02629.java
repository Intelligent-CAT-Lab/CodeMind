import java.util.Scanner;

public class p02629 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String res = "";
        while (N > 0) {
            N--;
            res += (char) (97 + N % 26);
            N /= 26;
        }
        System.out.println(res);
    }
}