import java.util.Scanner;

public class p02664 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        char[] aArray = a.toCharArray(); // convert string to char array

        for (int i = 0; i < aArray.length; i++) {
            if (aArray[i] == '?') {
                aArray[i] = 'D';
            }
        }

        String b = "";
        for (int i = 0; i < aArray.length; i++) {
            b += aArray[i]; // concatenate characters back to string
        }

        System.out.println(b);

        scanner.close(); // close the scanner to prevent resource leak
    }
}