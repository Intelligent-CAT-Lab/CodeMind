public class p03493 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int count = input.length() - input.replace("1", "").length();
        System.out.println(count);
    }
}



$ java Solution
101
67