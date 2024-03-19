public class p02577 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int tmp = 0;
        for (int i = 0; i < input.length(); i++) {
            tmp = (tmp + Integer.parseInt(input.substring(i, i + 1))) % 9;
        }
        if (tmp == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}