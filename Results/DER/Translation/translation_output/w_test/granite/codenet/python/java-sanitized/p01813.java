import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Map<String, int[]> map = new HashMap<>();

        String[] tokens = s.split("");
        int[] result = calculate(tokens, map);
        System.out.println(result[1]);
    }

    private static int[] calculate(String[] tokens, Map<String, int[]> map) {
        if (tokens.length == 1) {
            int[] result = new int[2];
            result[0] = Integer.parseInt(tokens[0]);
            result[1] = Integer.parseInt(tokens[0]);
            return result;
        }

        String key = String.join("", tokens);
        if (map.containsKey(key)) {
            return map.get(key);
        }

        int[] result = new int[2];
        result[0] = Integer.MAX_VALUE;
        result[1] = Integer.MIN_VALUE;

        for (int i = 1; i < tokens.length - 1; i++) {
            if (!tokens[i].equals("+") &&!tokens[i].equals("-")) {
                continue;
            }

            String[] leftTokens = Arrays.copyOfRange(tokens, 0, i);
            String[] rightTokens = Arrays.copyOfRange(tokens, i + 1, tokens.length);

            int[] leftResult = calculate(leftTokens, map);
            int[] rightResult = calculate(rightTokens, map);

            if (tokens[i].equals("+")) {
                result[0] = Math.min(result[0], leftResult[0] + rightResult[0]);
                result[1] = Math.max(result[1], leftResult[1] + rightResult[1]);
            } else {
                result[0] = Math.min(result[0], leftResult[0] - rightResult[1]);
                result[1] = Math.max(result[1], leftResult[1] - rightResult[0]);
            }
        }

        map.put(key, result);
        return result;
    }
}