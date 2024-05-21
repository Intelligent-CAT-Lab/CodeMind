public class p01555 {
    public static void main(String[] args) {
        int D = 20;
        int[] ds = new int[D];

        for (int i = 1; i < D; i++) {
            int fr = (int) Math.pow(10, i - 1) - 1;
            int to = (int) Math.pow(10, i) - 1;
            ds[i] = ds[i - 1] + (4 - i) * (to / 3 + to / 5 - (to / 15) * 2 - fr / 3 - fr / 5 + (fr / 15) * 2) + (8 - i) * (to / 15 - fr / 15) + i * (to - fr);
        }

        Scanner scanner = new Scanner(System.in);
        long m = scanner.nextLong();
        int c = (int) Math.floor(Math.log10(m)) + 1;
        int fr = (int) Math.pow(10, c - 1) - 1;
        int to = (int) m;
        int idx = ds[c - 1] + (4 - c) * (to / 3 + to / 5 - (to / 15) * 2 - fr / 3 - fr / 5 + (fr / 15) * 2) + (8 - c) * (to / 15 - fr / 15) + c * (to - fr);
        long num = (long) Math.pow(10, c - 1);
        String ans = "";
        while (ans.length() < m - idx + 20) {
            if (num % 15 == 0) {
                ans += "FizzBuzz";
            } else if (num % 3 == 0) {
                ans += "Fizz";
            } else if (num % 5 == 0) {
                ans += "Buzz";
            } else {
                ans += String.valueOf(num);
            }
            num++;
        }
        System.out.println(ans.substring((int) (m - idx - 1), (int) (m - idx + 19)));
    }
}