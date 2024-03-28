import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class atcoder_ABC114_C {
    static int N;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        
        System.out.println(aaa("0"));
    }
    
    static int aaa(String n) {
        if (Integer.parseInt(n) > N) {
            return 0;
        }
        
        Set<Character> digits = new HashSet<>();
        for (char c : n.toCharArray()) {
            digits.add(c);
        }
        
        int ans = digits.equals(Set.of('7', '5', '3')) ? 1 : 0;
        for (char i : new char[]{'7', '5', '3'}) {
            ans += aaa(n + i);
        }
        return ans;
    }
}