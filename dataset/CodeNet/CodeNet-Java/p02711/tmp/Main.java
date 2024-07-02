import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
System.out.println("[INST]5;n;s.nextInt();"+n);
        String string = String.valueOf(n);
System.out.println("[INST]6;string;String.valueOf(n);"+string);
        System.out.println(string.contains("7") ? "Yes" : "No");
    }
}