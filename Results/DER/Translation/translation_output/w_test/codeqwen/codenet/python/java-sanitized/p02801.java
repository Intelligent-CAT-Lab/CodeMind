import java.util.ArrayList;
import java.util.List;

public class p02801 {
    public static void main(String[] args) {
        String C = "a";
        List<Character> al = new ArrayList<>();
        for (int idx = 97; idx < 123; idx++) {
            al.add((char) idx);
        }
        int idx = al.indexOf(C.charAt(0));
        System.out.println(al.get(idx + 1));
    }
}