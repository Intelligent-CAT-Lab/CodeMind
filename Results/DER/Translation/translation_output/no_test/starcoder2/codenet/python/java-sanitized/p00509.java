public class p00509 {
    public static void main(String[] args) {
        System.out.println(f());
    }

    public static int f() {
        int n = 10;
        int c = 1;
        String s = "9";
        if (c < 0) {
            return (11, s + s)[n > 1];
        }
        for (String h : "9731") {
            if (n - 1 > 0) {
                for (int m = (int) (10 ** ~-n); m > 0; m--) {
                    m = Integer.parseInt(String.valueOf(m - 1));
                    if ((sum(Integer.parseInt(h + m)) * 2 + c) % 3 != 0) {
                        String t = h + String.format("%0" + (n - 1) + "d", m);
                        int a = Integer.parseInt(t + c + new StringBuilder(t).reverse().toString());
                        if (p(a)) {
                            return a;
                        }
                    }
                }
            } else {
                int a = Integer.parseInt(h + c + h);
                if (p(a)) {
                    return a;
                }
            }
        }
        return 0;
    }

    public static int sum(int x) {
        int sum = 0;
        while (x > 0) {
            sum += x % 10;
            x /= 10;
        }
        return sum;
    }

    public static int p(int x) {
        for (int i = 7; i < (int) Math.sqrt(x) + 1; i += 2) {
            if (x % i == 0) {
                return 0;
            }
        }
        return 1;
    }
}


Upvotes: 0