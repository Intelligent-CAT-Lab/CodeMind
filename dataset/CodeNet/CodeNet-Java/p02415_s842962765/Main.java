import java.util.Scanner;

public class Main {
    public static void main(String[] args ) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if('a' <= c && c <= 'z')
                c -= 'a' - 'A';
            else if('A' <= c && c <= 'Z')
                c += 'a' - 'A';
            System.out.print(c);
        }
        System.out.println();
    }
}

