public class p02124 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        String output = "a" + "1333" + "3".repeat(input / 100);
        System.out.println(output);
    }
}