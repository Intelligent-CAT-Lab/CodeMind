import java.util.ArrayList;
import java.util.Scanner;

public class p02801 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a letter:");
        String input = scanner.next(); // Reading a single character from user
        char C = input.charAt(0);

        ArrayList<Character> al = new ArrayList<>();
        for (char idx = 'a'; idx <= 'z'; idx++) {
            al.add(idx);
        }

        int index = al.indexOf(C);
        System.out.println(al.get(index + 1));
    }
}