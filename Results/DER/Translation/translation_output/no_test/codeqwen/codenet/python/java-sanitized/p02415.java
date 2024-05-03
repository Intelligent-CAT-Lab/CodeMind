import java.util.Scanner;

public class p02415 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(s.toLowerCase().replace('a', 'A').replace('e', 'E').replace('i', 'I').replace('o', 'O').replace('u', 'U').replace('A', 'a').replace('E', 'e').replace('I', 'i').replace('O', 'o').replace('U', 'u'));
    }
}