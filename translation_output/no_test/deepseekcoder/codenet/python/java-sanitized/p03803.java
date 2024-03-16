import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class p03803 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);

        List<Integer> j = Arrays.asList(2,3,4,5,6,7,8,9,10,11,12,13,1);
        int indexA = j.indexOf(a);
        int indexB = j.indexOf(b);

        if (indexA > indexB) {
            System.out.println("Alice");
        } else if (indexA < indexB) {
            System.out.println("Bob");
        } else {
            System.out.println("Draw");
        }
    }
}