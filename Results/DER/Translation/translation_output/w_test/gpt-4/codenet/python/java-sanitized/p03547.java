import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class p03547 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Character, Integer> hexMap = new HashMap<>();
        hexMap.put('A', 10);
        hexMap.put('B', 11);
        hexMap.put('C', 12);
        hexMap.put('D', 13);
        hexMap.put('E', 14);
        hexMap.put('F', 15);

        String input = scanner.nextLine();
        String[] parts = input.split(" ");
        char N = parts[0].charAt(0);
        char M = parts[1].charAt(0);
        
        int valueN = hexMap.get(N);
        int valueM = hexMap.get(M);

        if (valueN > valueM) {
            System.out.println(">");
        } else if (valueN == valueM) {
            System.out.println("=");
        } else {
            System.out.println("<");
        }

        scanner.close();
    }
}