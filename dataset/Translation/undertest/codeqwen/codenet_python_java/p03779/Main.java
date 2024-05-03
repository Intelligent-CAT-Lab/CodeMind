import java.util.Scanner;

public class p03779 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        //2æ¬¡æ¹ç¨å¼ãè§£ã
        int t = (int)(Math.sqrt(-1+(1+8*x))/2);

        if (t * (t+1) / 2 >= x) {
            System.out.println(t);
        } else {
            System.out.println(t+1);
        }
    }
}