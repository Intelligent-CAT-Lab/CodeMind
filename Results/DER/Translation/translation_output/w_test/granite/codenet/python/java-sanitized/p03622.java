public class p03622 {
    public static void main(String[] args) {
        int M = (int) Math.pow(8, 7);
        int[] f = new int[M + 1];
        int[] g = new int[M + 1];
        int[] k = new int[M + 1];
        int m = M * 476 + 1;
        int i = 1;
        f[1] = 1;
        while (i < M) {
            f[i + 1] = (int) ((long) f[i] * i % m);
            i++;
        }
        g[M] = 1;
        i = M - 1;
        while (i > 0) {
            g[i] = (int) ((long) g[i + 1] * (i + 1) % m);
            i--;
        }
        k[0] = 1;
        i = 1;
        while (i <= M) {
            k[i] = (int) ((long) k[i - 1] * 2 % m);
            i++;
        }
        String[] input = args[0].split(" ");
        int A = Integer.parseInt(input[0]);
        int B = Integer.parseInt(input[1]);
        if (A < B) {
            int temp = A;
            A = B;
            B = temp;
        }
        int j = 1;
        int result = 0;
        while (j <= B) {
            result = (int) ((long) result + (long) k[j] * f[A + B - j] * g[B - j] % m);
            j++;
        }
        result = (int) ((long) result * f[B] * g[A + B] % m);
        result = (result + A) % m;
        System.out.println(result);
    }
}