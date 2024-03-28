public class p03211 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int a = 99999;
        for (int i = 0; i < input.length() - 2; i++) {
            int num = Integer.parseInt(input.substring(i, i + 3));
            a = Math.min(Math.abs(753 - num), a);
        }
        System.out.println(a);
    }
}