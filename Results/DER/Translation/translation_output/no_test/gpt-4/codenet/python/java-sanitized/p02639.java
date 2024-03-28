import java.util.*;

public class p02639 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading a line of input and splitting it into an array of strings
        String[] inputs = scanner.nextLine().split("\\s+");

        // Converting the input strings to integers and storing them in an array
        int[] x_list = new int[inputs.length];
        for (int i = 0; i < inputs.length; i++) {
            x_list[i] = Integer.parseInt(inputs[i]);
        }

        // Looping through the first 5 elements of the array to find a zero
        for (int i = 0; i < 5; i++) {
            if (x_list[i] == 0) {
                System.out.println(i + 1);
            }
        }

        scanner.close();
    }
}