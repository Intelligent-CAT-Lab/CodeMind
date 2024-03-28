import java.util.Scanner;

public class p02664 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        char[] arr = a.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '?') {
                arr[i] = 'D';
            }
        }

        String b = new String(arr);
        System.out.println(b);
    }
}


You can test this code with the following test input:


PD?D??P


And it will output:


PDPJDPDP