import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class p03582 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] parts = scanner.nextLine().split(" ");
        int a = Integer.parseInt(parts[0]);
        int b = Integer.parseInt(parts[1]);
        int c = Integer.parseInt(parts[2]);
        scanner.close();
        
        ArrayList<ArrayList<Integer>> L = new ArrayList<>();
        for (int i = 0; i < a; i++) {
            L.add(new ArrayList<>(Arrays.asList(0)));
        }
        for (int i = 0; i < b; i++) {
            L.add(new ArrayList<>(Arrays.asList(1)));
        }
        for (int i = 0; i < c; i++) {
            L.add(new ArrayList<>(Arrays.asList(2)));
        }
        
        while (L.size() > 1) {
            ArrayList<Integer> last = L.remove(L.size() - 1);
            L.get(0).addAll(last);
            Collections.sort(L, (list1, list2) -> list