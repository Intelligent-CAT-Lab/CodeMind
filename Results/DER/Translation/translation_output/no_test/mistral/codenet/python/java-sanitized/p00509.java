public class p00509 {
    public static int p(int x) {
        for (int i = 7; i <= (int) Math.sqrt(x) + 1; i += 2) {
            if (x % i == 0) {
                return 0;
            }
        }
        return 1;
    }

    public static int f() {
        Scanner sc = new Scanner(System.in);
        int n, c = sc.nextInt();
        String s = "9".repeat(n);
        if (c < 0) {
            return (11, s + s)[n > 1];
        }
        for (char h : "9731".toCharArray()) {
            if (n - 1) {
                for (int m = (int) Math.pow(10, n - 1); m >= 0; m--) {
                    String mStr = Integer.toString(m - 1);
                    int sum = 0;
                    for (char k : h + mStr.toCharArray()) {
                        sum += Integer.parseInt(String.valueOf(k));
                    }
                    if ((sum * 2 + c) % 3 == 0) {
                        String t = h + mStr.substring(1, n - 1) + String.valueOf(c) + t.substring(0, 1);
                        int a = Integer.parseInt(t);
                        if (p(a)) {
                            return a;
                        }
                    }
                }
            } else {
                int a = Integer.parseInt(h + String.valueOf(c) + h);
                if (p(a)) {
                    return a;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(f());
    }
}