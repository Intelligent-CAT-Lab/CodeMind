import java.util.HashMap;
import java.util.Scanner;

public class p02842 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 1; i <= 50000; i++) {
            int p = (int) (i *