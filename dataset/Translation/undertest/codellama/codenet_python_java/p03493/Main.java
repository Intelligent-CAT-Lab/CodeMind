public class p03493 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int count = input.length() - input.replace("1", "").length();
        System.out.println(count);
    }
}



public class p03493 {
    @Test
    public void test() {
        String input = "101";
        int expectedOutput = 2;
        int actualOutput = Solution.main(input);
        assertEquals(expectedOutput, actualOutput);
    }
}