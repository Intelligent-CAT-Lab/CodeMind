public class p01751 {
    public static void main(String[] args) {
        // Assuming the input is given as command-line arguments
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        int t = 0;
        boolean found = false;

        for (int loop = 0; loop < 61; loop++) {
            if (t % 60 <= c && c <= t % 60 + a) {
                System.out.println(t / 60 * 60 + c);
                found = true;
                break;
            }
            t += a + b;
        }

        if (!found) {
            System.out.println(-1);
        }
    }
}