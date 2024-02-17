import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        StringBuilder sb = new StringBuilder();
        while(0 < N) {
            N--;
            sb.append((char)('a' + N%26));
            N /= 26;
        }
        System.out.println(sb.reverse());
    }
}