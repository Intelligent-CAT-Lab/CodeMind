public class p01741 {
    public static void main(String[] args) {
        double n = Double.parseDouble(args[0]);
        double result = n / 1 + 1;
        if (n * Math.pow(2, 0.5) < result) {
            result = n * Math.pow(2, 0.5);
        }
        System.out.println(result);
    }
}