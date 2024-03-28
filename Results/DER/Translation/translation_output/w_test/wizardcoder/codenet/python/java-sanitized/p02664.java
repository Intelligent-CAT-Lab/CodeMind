import java.util.Scanner;

public class p02664 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        char[] arr = input.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '?') {
                arr[i] = 'D';
            }
        }
        String output = new String(arr);
        System.out.println(output);
    }
}