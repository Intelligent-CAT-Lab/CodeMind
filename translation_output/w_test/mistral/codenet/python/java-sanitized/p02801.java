import java.util.ArrayList;
import java.util.Scanner;

public class p02801 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Character> al = new ArrayList<Character>();
        for (int idx = 97; idx < 123; idx++) {
            al.add((char) idx);
        }
        char C = sc.next().charAt(0);
        int idx = al.indexOf(C);
        System.out.println(al.get(idx + 1));
    }
}