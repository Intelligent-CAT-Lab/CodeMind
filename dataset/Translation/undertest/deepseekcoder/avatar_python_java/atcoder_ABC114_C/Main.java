import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class atcoder_ABC114_C {
    static int N;
    static int count = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        aaa("0");
        System.out.println(count);
    }

    static void aaa(String n) {
        if (Integer.parseInt(n) > N) {
            return;
        }
        if (isContains753(n)) {
            count++;
        }
        for (char c : "753".toCharArray()) {
            aaa(n + c);
        }
    }

    static boolean isContains753(String str) {
        Set<Character> set = new HashSet<>();
        for (char c : str.toCharArray()) {
            set.add(c);
        }
        return set.equals(new HashSet<Character>() {{
            add('7');
            add('5');
            add('3');
        }});
    }
}