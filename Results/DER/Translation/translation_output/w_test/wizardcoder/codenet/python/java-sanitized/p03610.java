import java.util.Scanner;

public class p03610 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(s.replaceAll("(?<=.)(.)(?=.)", "$2"));
    }
}