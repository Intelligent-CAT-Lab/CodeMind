public class p00400 {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        if (n >= 65 && n <= 90) {
            System.out.println("1");
        } else if (n >= 97 && n <= 122) {
            System.out.println("2");
        } else {
            System.out.println("0");
        }
    }
}