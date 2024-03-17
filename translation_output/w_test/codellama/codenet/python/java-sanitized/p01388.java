public class p01388 {
    public static void main(String[] args) {
        String input = "KUPCkupcKUPC";
        int K = 0, U = 0, P = 0, C = 0;
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c == 'K') {
                K++;
            } else if (c == 'U') {
                U++;
            } else if (c == 'P') {
                P++;
            } else if (c == 'C') {
                C++;
            }
        }
        System.out.println(Math.min(K, Math.min(U, Math.min(P, C))));
    }
}