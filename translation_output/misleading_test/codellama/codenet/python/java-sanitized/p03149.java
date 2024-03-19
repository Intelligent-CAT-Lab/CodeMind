import java.util.Scanner;

public class p03149 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] numbers = input.split(" ");
        int[] sortedNumbers = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            sortedNumbers[i] = Integer.parseInt(numbers[i]);
        }
        Arrays.sort(sortedNumbers);
        int[] expectedNumbers = {1, 4, 7, 9};
        if (Arrays.equals(sortedNumbers, expectedNumbers)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}