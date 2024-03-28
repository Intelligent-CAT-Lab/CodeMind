import java.util.*;
import java.lang.*;

public class p03672 {
    public static void eprint(Object... args) {
        for (Object arg : args) {
            System.err.print(arg);
        }
        System.err.println();
    }

    public static List<Integer> reverseRange(int largeA, int smallB, int i) {
        List<Integer> list = new ArrayList<>();
        for (int j = smallB; j < largeA; j += i) {
            list.add(j);
        }
        Collections.reverse(list);
        return list;
    }

    public static List<Integer> crange(int a, int b, int i) {
        List<Integer> list = new ArrayList<>();
        for (int j = a; j <= b; j += i) {
            list.add(j);
        }
        return list;
    }

    public static List<Integer> reverseCrange(int largeA, int smallB, int i) {
        List<Integer> list = new ArrayList<>();
        for (int j = smallB; j < largeA; j -= i) {
            list.add(j);
        }
        return list;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().strip();
        List<Integer> lll = new ArrayList<>();
        for (int i = 1; i < s.length() - 1; i += 2) {
            lll.add(i);
        }
        Collections.reverse(lll);
        for (int i : lll) {
            eprint("range: ", lll);
            if (s.substring(0, i / 2).equals(s.substring(i / 2, i))) {
                System.out.println(i);
                return;
            } else {
                eprint("debug: ", "false this time");
            }
        }
    }
}