import java.util.Scanner;

public class p02212 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int[] numbers = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }
        int[] sortedNumbers = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            sortedNumbers[i] = numbers[i];
        }
        Arrays.sort(sortedNumbers);
        int sum1 = sortedNumbers[0] + sortedNumbers[3];
        int sum2 = sortedNumbers[1] + sortedNumbers[2];
        int difference = Math.abs(sum1 - sum2);
        System.out.println(difference);
    }
}