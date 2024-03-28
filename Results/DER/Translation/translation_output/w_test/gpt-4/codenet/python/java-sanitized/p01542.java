import java.util.HashMap;
import java.util.Map;

public class p01542 {

    public static void main(String[] args) {
        // Test input
        String input = "000";
        System.out.println(evaluateExpression(input));
    }

    public static int evaluateExpression(String s) {
        Map<String, Integer> memoization = new HashMap<>();
        return f(s, memoization);
    }

    private static int f(String s, Map<String, Integer> memoization) {
        if (memoization.containsKey(s)) {
            return memoization.get(s);
        }

        if (s.contains(")")) {
            int rightIndex = s.indexOf(")");
            int leftIndex = s.lastIndexOf("(", rightIndex);

            if (leftIndex == -1 || rightIndex < s.length() - 1 && isBinaryDigit(s.charAt(rightIndex + 1))) {
                memoization.put(s, -1);
                return -1;
            }
    
            String ts = s.substring(leftIndex + 1, rightIndex);
            if (!ts.contains("+") && !ts.contains("-") && !ts.contains("*")) {
                memoization.put(s, -1);
                return -1;
            }
    
            int tr = f(ts, memoization);
            if (tr == -1) {
                memoization.put(s, -1);
                return -1;
            }
    
            String result = f(s.substring(0, leftIndex) + Integer.toString(tr) + s.substring(rightIndex + 1), memoization);
            memoization.put(s, result);
            return result;
        }
    
        if (s.contains("(")) {
            memoization.put(s, -1);
            return -1;
        }
    
        // ... (remaining code to handle *, +, and - operations) ...

        // NOTICE: