public class p03704 {
    public static void main(String[] args) {
        String D = System.console().readLine();
        System.out.println(sum(D, 1, 0));
    }

    public static int sum(String D, int x, int y) {
        int n = (int) Math.pow(10, x) + (int) Math.pow(10, y);
        return x < 1 ? 0 : (int) (f(D, x - 2, y + 1) * (10 - Math.abs(f(D, x - 2, y + 1)) - (y < 1)));
    }

    public static int f(String D, int x, int y) {
        int n = (int) Math.pow(10, x) + (int) Math.pow(10, y);
        return D.length() == 0 ? 0 : (int) (f(D.substring(1), x - 2, y + 1) * (10 - Math.abs(f(D.substring(1), x - 2, y + 1)) - (y < 1)));
    }
}