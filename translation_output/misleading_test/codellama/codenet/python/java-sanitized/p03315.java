public class p03315 {
    public static void main(String[] args) {
        String input = args[0];
        int plusCount = 0;
        int minusCount = 0;
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c == '+') {
                plusCount++;
            } else if (c == '-') {
                minusCount++;
            }
        }
        System.out.println(plusCount - minusCount);
    }
}



$ java Solution +-++
40