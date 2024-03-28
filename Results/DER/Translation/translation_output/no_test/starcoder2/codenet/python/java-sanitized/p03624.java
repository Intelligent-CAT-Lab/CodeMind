import java.util.Scanner;
import java.util.Arrays;

public class p03624 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] s2 = s.toCharArray();
        char[] s3 = new char[s2.length];
        for (int i = 0; i < s2.length; i++) {
            s3[i] = s2[i];
        }
        Arrays.sort(s3);
        char[] s4 = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        boolean flag = true;
        for (int i = 0; i < s3.length; i++) {
            if (s3[i] != s4[i]) {
                System.out.println(s4[i]);
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println(s4[s3.length]);
        }
    }
}