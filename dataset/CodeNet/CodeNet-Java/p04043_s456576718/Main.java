import java.util.*;
public class Main {
    static Scanner s = new Scanner(System.in);
    public static void main(String __[]) {
        int in[]= {s.nextInt(),s.nextInt(),s.nextInt()};
        Arrays.sort(in);
        System.out.println(in[0]==5&&in[1]==5&&in[2]==7?"YES":"NO");

    }
}
