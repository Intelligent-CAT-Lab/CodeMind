import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class p03582 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        ArrayList<ArrayList<Integer>> L = new ArrayList<>();

        for (int i = 0; i < a; i++) {
            ArrayList<Integer> sublist = new ArrayList<>();
            sublist.add(0);
            L.add(sublist);
        }
        for (int i = 0; i < b; i++) {
            ArrayList<Integer> sublist = new ArrayList<>();
            sublist.add(1);
            L.add(sublist);
        }
        for (int i = 0; i < c; i++) {
            ArrayList<Integer> sublist = new ArrayList<>();
            sublist.add(2);
            L.add(sublist);
        }

        while (L.size() > 1) {
            ArrayList<Integer> firstList = L.get(0);
            firstList.addAll(L.remove(L.size() - 1));
            Collections.sort(L, (list1, list2) -> {
                for (int i = 0; i < Math.min(list