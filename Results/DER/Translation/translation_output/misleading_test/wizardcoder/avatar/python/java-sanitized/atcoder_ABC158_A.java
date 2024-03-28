import java.util.Scanner;

public class atcoder_ABC158_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String result = " Yes " + (s.contains(" A ") && s.contains(" B "))? " Yes " : " No ";
        System.out.println(result);
    }
}