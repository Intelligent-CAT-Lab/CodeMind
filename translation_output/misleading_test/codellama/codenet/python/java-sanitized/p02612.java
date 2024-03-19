public class p02612 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int result = 1000 - n % 1000;
        if (n % 1000 == 0) {
            result = 0;
        }
        System.out.println(result);
    }
}