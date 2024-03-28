import java.util.Scanner;

public class codeforces_544_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int[] numbers = new int[2];
        for (int i = 0; i < 2; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }
        
        int start = 0;
        String[] arr = new String[numbers[0]];
        int count = 0;
        
        for (int i = 0; i < numbers[0]; i++) {
            String string = " ";
            int next = start;
            for (int j = 0; j < numbers[0]; j++) {
                if (count < numbers[1]) {
                    if (j == next) {
                        string += " L ";
                        count++;
                        next += 2;
                        if (next >= numbers[0]) {
                            start = start == 0 ? 1 : 0;
                        }
                    } else {
                        string += " S ";
                    }
                } else {
                    string += " S ";
                }
            }
            arr[i] = string;
        }
        
        if (count < numbers[1]) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
            for (String i : arr) {
                System.out.println(i);
            }
        }
    }
}