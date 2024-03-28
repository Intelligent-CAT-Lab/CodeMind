import java.util.Scanner;

public class p02212 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int[] numbers = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }
        Arrays.sort(numbers);
        int sum1 = numbers[0] + numbers[3];
        int sum2 = numbers[1] + numbers[2];
        System.out.println(Math.abs(sum1 - sum2));
    }
}


Next, the code calculates the sum of the first and third elements of the sorted array, and the sum of the second and fourth elements of the sorted array.