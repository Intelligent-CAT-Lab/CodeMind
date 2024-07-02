import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
System.out.println("[INST]5;N;sc.nextLong();"+N);
        StringBuilder sb = new StringBuilder();
        while(0 < N) {
            N--;
            sb.append((char)('a' + N%26));
System.out.println("[INST]9;None;sb.append((char)('a' + N%26));"+sb.append((char)('a' + N%26)));
            N /= 26;
        }
        System.out.println(sb.reverse());
    }
}