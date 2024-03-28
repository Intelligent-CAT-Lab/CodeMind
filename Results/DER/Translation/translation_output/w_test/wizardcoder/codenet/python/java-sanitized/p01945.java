import java.util.*;

public class p01945 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        int N = S.indexOf('*');
        int P = Math.abs(Arrays.stream(S.substring(0, N).toCharArray()).filter(c -> c == '(').count() - Arrays.stream(S.substring(0, N).toCharArray()).filter(c -> c == ')').count());
        int Q = Math.abs(Arrays.stream(S.substring(N+1).toCharArray()).filter(c -> c == '(').count() - Arrays.stream(S.substring(N+1).toCharArray()).filter(c -> c == ')').count());
        System.out.println(Math.min(P, Q));
    }
}