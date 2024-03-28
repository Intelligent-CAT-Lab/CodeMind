public class p03210 {
    public static void main(String[] args) {
        String X = args[0];
        String ans;

        if (X.equals("7") || X.equals("5") || X.equals("3")) {
            ans = "YES";
        } else {
            ans = "NO";
        }

        System.out.println(ans);
    }
}