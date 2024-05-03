import java.util.Arrays;
import java.util.stream.IntStream;

public class p01725 {
    public static void main(String[] args) {
        String S = System.console().readLine() + "$";
        int ans = -1000000000;
        for (int[] pri : IntStream.range(0, 3).boxed().collect(Collectors.toList()).stream().flatMap(i -> IntStream.range(0, 3).boxed().collect(Collectors.toList()).stream().map(j -> IntStream.range(0, 3).boxed().collect(Collectors.toList()).stream().map(k -> new int[]{i, j, k}))).collect(Collectors.toList())) {
            ans = Math.max(ans, parse(pri, S));
        }
        System.out.println(ans);
    }

    public static int parse(int[] pri, String S) {
        String[] code = {"+", "-", "*"};
        int cur = 0;
        int number() {
            if (S.charAt(cur) == '(') {
                cur++; // '('
                int v = expr(pri, S);
                cur++; // ')'
                return v;
            }
            int num = 0;
            while (Character.isDigit(S.charAt(cur))) {
                num = 10 * num + Character.getNumericValue(S.charAt(cur));
                cur++;
            }
            return num;
        }

        int expr(int[] pri, String S) {
            int op = '+';
            int result = 0;
            while (true) {
                if (pri[code.indexOf(op)] == 2) {
                    int v = number();
                } else {
                    int v = expr(pri, S);
                }
                if (op == '+') {
                    result += v;
                } else if (op == '-') {
                    result -= v;
                } else