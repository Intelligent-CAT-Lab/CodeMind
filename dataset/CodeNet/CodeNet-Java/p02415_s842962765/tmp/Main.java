import java.util.Scanner;

public class Main {
    public static void main(String[] args ) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();
System.out.println("[INST]6;s;scanner.nextLine();"+s);
        for(int i = 0; i < s.length(); i++){
System.out.println("[INST]7;None;s.length();"+s.length());
            char c = s.charAt(i);
System.out.println("[INST]8;c;s.charAt(i);"+c);
            if('a' <= c && c <= 'z')
                c -= 'a' - 'A';
            else if('A' <= c && c <= 'Z')
                c += 'a' - 'A';
            System.out.print(c);
        }
        System.out.println();
    }
}

