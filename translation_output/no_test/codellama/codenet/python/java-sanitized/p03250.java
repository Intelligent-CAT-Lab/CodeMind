import java.util.Scanner;

public class p03250 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] numbers = input.split(" ");
        int[] intNumbers = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            intNumbers[i] = Integer.parseInt(numbers[i]);
        }
        Arrays.sort(intNumbers);
        int sum = intNumbers[2] + intNumbers[1] + intNumbers[0];
        System.out.println(sum);
    }
}


Next, it sorts the array of integers using the `Arrays.sort` method. Finally, it calculates the sum of the first three elements of the sorted array and prints it to the console using the `System.out.println` method.