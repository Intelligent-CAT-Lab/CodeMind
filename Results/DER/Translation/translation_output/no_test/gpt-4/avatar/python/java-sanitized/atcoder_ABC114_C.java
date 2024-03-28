import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class atcoder_ABC114_C {
    private static int N;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        System.out.println(aaa("0"));
        scanner.close();
    }

    private static int aaa(String n) {
        int num = Integer.parseInt(n);
        if (num > N) {
            return 0;
        }
        
        Set<Character> set = new HashSet<>();
        for (char ch : n.toCharArray()) {
            set.add(ch);
        }
        
        // Check if the set contains exactly '7', '5', '3'
        int ans = (set.size() == 3 && set.contains('7') && set.contains('5') && set.contains('3')) ? 1 : 0;
        
        for (char i : new char[]{'7', '5', '3'}) {
            ans += aaa(n + i);
        }
        return ans;
    }
}