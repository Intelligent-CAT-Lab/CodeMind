public class p03622 {
    public static void main(String[] args) {
        int M = (int) Math.pow(8, 7);
        int[] m = new int[1];
        int[] f = new int[M + 1];
        int[] g = new int[M];
        int[] i = new int[1];
        f[1] = 1;
        i[0] = 1;
        g[0] = 1;
        int j = 1;
        while (i[0] < M) {
            f[i[0] + 1] = (int) ((long) f[i[0]] * i[0] % m[0]);
            i[0]++;
        }
        j = 1;
        while (j <= M) {
            g[M - j] = (int) ((long) g[M - j + 1] * (M - j + 1) % m[0]);
            j++;
        }
        String[] input = args[0].split(" ");
        int A = Integer.parseInt(input[0]);
        int B = Integer.parseInt(input[1]);
        if (A < B) {
            int temp = A;
            A = B;
            B = temp;
        }
        j = 1;
        int k = 1;
        int result = 0;
        while (j <= B) {
            result = (result + (int) ((long) k * f[A + B - j] * g[B - j] % m[0])) % m[0];
            k = (k * 2) % m[0];
            j++;
        }
        result = (int) ((long) result * f[B] * g[A + B] % m[0]);
        result = (result + A) % m[0];
        System.out.println(result);
    }
}