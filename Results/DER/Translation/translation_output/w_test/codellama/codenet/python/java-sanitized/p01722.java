public class p01722 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n == 0) {
            System.out.println(1);
        } else {
            System.out.println(2 / n);
        }
    }
}