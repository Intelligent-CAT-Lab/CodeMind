import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
System.out.println("[INST]7;a;sc.next();"+a);
        String b = sc.next();
System.out.println("[INST]8;b;sc.next();"+b);
        String c = sc.next();
System.out.println("[INST]9;c;sc.next();"+c);

        if (a.charAt(a.length() - 1) == b.charAt(0) && b.charAt(b.length() - 1) == c.charAt(0)) {
System.out.println("[INST]11;None;a.charAt(a.length() - 1);"+a.charAt(a.length() - 1));
System.out.println("[INST]11;None;a.length();"+a.length());
System.out.println("[INST]11;None;b.charAt(0);"+b.charAt(0));
System.out.println("[INST]11;None;b.charAt(b.length() - 1);"+b.charAt(b.length() - 1));
System.out.println("[INST]11;None;b.length();"+b.length());
System.out.println("[INST]11;None;c.charAt(0);"+c.charAt(0));
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}