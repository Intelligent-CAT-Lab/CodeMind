import java.util.*;

public class atcoder_ABC114_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        System.out.println(aaa("0", N));
    }

    public static int aaa(String n, int N) {
        if (Integer.parseInt(n) > N) {
            return 0;
        }
        int ans = (new HashSet<>(Arrays.asList('7', '5', '3'))).equals(getUniqueDigits(n)) ? 1 : 0;
        for (char i : "753".toCharArray()) {
            ans += aaa(n + i, N);
        }
        return ans;
    }

    public static Set<Character> getUniqueDigits(String str) {
        Set<Character> uniqueDigits = new HashSet<>();
        for (char c : str.toCharArray()) {
            uniqueDigits.add(c);
        }
        return uniqueDigits;
    }
}