import java.util.ArrayList;

public class p02801 {
    public static void main(String[] args) {
        char C = 'a';
        ArrayList<Character> al = new ArrayList<>();
        for (int idx = 97; idx < 123; idx++) {
            al.add((char) idx);
        }

        int index = al.indexOf(C);
        System.out.println(al.get(index + 1));
    }
}