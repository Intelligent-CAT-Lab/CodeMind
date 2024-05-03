public class p03893 {
    public static void main(String[] args) {
        Integer[] g = new Integer[50];
        Integer[] h = new Integer[50];
        h[1] = 3;
        g[1] = 6;
        int X = Integer.parseInt(System.console().readLine());
        for (int i = 2; i <= X; i++) {
            h[i] = g[i-1] + 1;
            g[i] = 2*h[i];
        }
        System.out.println(g[X]);
    }
}