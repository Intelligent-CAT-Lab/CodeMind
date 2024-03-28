import java.util.Scanner;

public class p03797 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int c = sc.nextInt();
        int result = 0;
        
        if (s * 2 <= c) {
            result = s + ((c-s*2)//4);
        } else {
            result = c/2;
        }
        
        System.out.println(result);
    }
}