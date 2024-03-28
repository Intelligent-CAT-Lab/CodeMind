import java.util.Scanner;

public class p02149 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading input
        int[] S = new int[3];
        for (int i = 0; i < 3; i++) {
            S[i] = scanner.nextInt();
        }

        // Determining the highest score and its index
        int maxIndex = 0;
        int maxScore = S[0];

        for (int i = 1; i < 3; i++) {
            if (S[i] > maxScore) {
                maxScore = S[i];
                maxIndex = i;
            }
        }

        // Printing the result based on the index of the maximum score
        switch (maxIndex) {
            case 0:
                System.out.println("A");
                break;
            case 1:
                System.out.println("B");
                break;
            case 2:
                System.out.println("C");
                break;
        }

        scanner.close();
    }
}