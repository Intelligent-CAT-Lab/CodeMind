public class p03547 {
    public static void main(String[] args) {
        int A = 10;
        int B = 11;
        int C = 12;
        int D = 13;
        int E = 14;
        int F = 15;

        String[] input = args[0].split(" ");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);

        if (N > M) {
            System.out.println(">");
        } else if (N == M) {
            System.out.println("=");
        } else {
            System.out.println("<");
        }
    }
}