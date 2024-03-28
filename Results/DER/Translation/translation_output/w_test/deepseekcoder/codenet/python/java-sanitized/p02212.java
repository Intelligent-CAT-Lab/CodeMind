import java.util.Arrays;
import java.util.Scanner;

public class p02212 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] l = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(l);
        System.out.println(Math.abs((l[0] + l[l.length - 1]) - (l[1] + l[2])));
    }
}