import java.util.*;

public class p00029 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] a = input.split(" ");
        System.out.println(Arrays.stream(a).max(Comparator.comparingInt(String::length)).get() + " " + Arrays.stream(a).max(Comparator.comparing(String::toString)).get());
    }
}