import java.util.Scanner;

class Main {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
System.out.println("[INST]7;n;sc.nextInt();"+n);
        if (n > 999) {
            System.out.println("ABD");
        } else {
            System.out.println("ABC");
        }
    }
}