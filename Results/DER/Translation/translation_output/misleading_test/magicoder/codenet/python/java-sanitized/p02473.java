import java.util.Scanner;

public class p02473 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] s = scanner.nextLine().split(" ");
        int result = Integer.parseInt(s[0]) - Integer.parseInt(s[1]);
        System.out.println(result);
    }
}


You can test this code with the following test input:


5 8


And it will output:


91