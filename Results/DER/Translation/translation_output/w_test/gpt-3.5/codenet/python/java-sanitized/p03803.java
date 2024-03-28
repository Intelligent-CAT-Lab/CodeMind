import java.util.Scanner;

public class p03803 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();

        int[] j = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 1};

        int indexA = -1;
        int indexB = -1;

        for (int i = 0; i < j.length; i++) {
            if (j[i] == a) {
                indexA = i;
            }
            if (j[i] == b) {
                indexB = i;
            }
        }

        if (indexA > indexB) {
            System.out.println("Alice");
        } else if (indexA < indexB) {
            System.out.println("Bob");
        } else {
            System.out.println("Draw");
        }
    }
}