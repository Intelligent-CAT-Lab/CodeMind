import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class p03267 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int L = scanner.nextInt();
        List<List<Integer>> edges = new ArrayList<>();

        int length = Integer.toBinaryString(L).length();
        for (int i = 1; i < length; i++) {
            List<Integer> edge1 = new ArrayList<>();
            edge