import java.util.*;

public class p00029 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] a = scanner.nextLine().split(" ");
        System.out.println(Collections.max(Arrays.asList(a), Comparator.comparing(String::length)) + " " +
                Collections.max(Arrays.asList(a), Comparator.comparing(x -> Collections.frequency(Arrays.asList(a), x))));
    }
}