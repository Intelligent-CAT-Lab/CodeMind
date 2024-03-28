import java.util.Scanner;

public class p03945 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int count = (int) input.chars().filter(ch -> ch == 'W' || ch == 'B').count();
        System.out.println(count);
    }
}