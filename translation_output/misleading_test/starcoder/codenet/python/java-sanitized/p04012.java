import java.util.*;
public class p04012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] alfa = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l','m', 'n', 'o', 'p', 'q', 'r','s', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        for (int i = 0; i < alfa.length; i++) {
            if (s.indexOf(alfa[i])!= -1) {
                if (s.indexOf(alfa[i]) % 2 == 1) {
                    System.out.println("No");
                    return;
                }
            }
        }
        System.out.println("Yes");
    }
}