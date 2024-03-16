import java.util.ArrayList;
import java.util.Scanner;

public class p02801 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char C = sc.next().charAt(0);
        ArrayList<Character> al = new ArrayList<>();
        for (int idx = 97; idx < 123; idx++) {
            al.add((char) idx);
        }
        int idx = al.indexOf(C);
        System.out.println(al.get(idx + 1));
    }
}