import java.util.*;
public class p00029 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] a = sc.nextLine().split(" ");
        System.out.println(Collections.max(Arrays.asList(a), new Comparator<String>() {
            public int compare(String s1, String s2) {
                return s