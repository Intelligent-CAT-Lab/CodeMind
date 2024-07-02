import java.util.Scanner;

public class  Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //
        String c = sc.nextLine();
System.out.println("[INST]5;c;sc.nextLine();"+c);

        if (c.equals("a")) {
System.out.println("[INST]7;None;c.equals('a');"+c.equals("a"));
            System.out.println("vowel");
        } else if (c.equals("i")) {
System.out.println("[INST]9;None;c.equals('i');"+c.equals("i"));
            System.out.println("vowel");
        } else if (c.equals("u")) {
System.out.println("[INST]11;None;c.equals('u');"+c.equals("u"));
            System.out.println("vowel");
        } else if (c.equals("e")) {
System.out.println("[INST]13;None;c.equals('e');"+c.equals("e"));
            System.out.println("vowel");
        } else if (c.equals("o")) {
System.out.println("[INST]15;None;c.equals('o');"+c.equals("o"));
            System.out.println("vowel");
        } else {
            System.out.println("consonant");
        }
    }

}