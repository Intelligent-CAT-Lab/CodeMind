import java.util.*;
public class atcoder_ABC043_B {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String my_str = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0' || s.charAt(i) == '1') {
                my_str += s.charAt(i);
            } else if (s.charAt(i) == 'B' && my_str.length()!= 0) {
                my_str = my_str.substring(0, my_str.length() - 1);
            }
        }
        System.out.println(my_str);
    }
}