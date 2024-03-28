Solution


public class p02801 {
    public static void main(String[] args) {
        String C = "a";
        char[] al = new char[26];
        for (int idx = 97; idx < 123; idx++) {
            al[idx - 97] = (char) idx;
        }
        int idx = al.indexOf(C);
        System.out.println(al[idx + 1]);
    }
}