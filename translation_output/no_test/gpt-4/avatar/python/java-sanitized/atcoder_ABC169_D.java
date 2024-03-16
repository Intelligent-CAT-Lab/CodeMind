import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class atcoder_ABC169_D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        List<Pair> l = factorization(x);
        l.sort((pair1, pair2) -> pair