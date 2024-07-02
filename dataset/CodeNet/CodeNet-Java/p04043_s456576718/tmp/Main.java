import java.util.*;
public class Main {
    static Scanner s = new Scanner(System.in);
    public static void main(String __[]) {
        int in[]= {s.nextInt(),s.nextInt(),s.nextInt()};
System.out.println("[INST]4;None;s.nextInt();"+s.nextInt());
System.out.println("[INST]4;None;s.nextInt();"+s.nextInt());
System.out.println("[INST]4;None;s.nextInt();"+s.nextInt());
        Arrays.sort(in);
System.out.println("[INST]5;None;Arrays.sort(in);"+Arrays.sort(in));
        System.out.println(in[0]==5&&in[1]==5&&in[2]==7?"YES":"NO");

    }
}
