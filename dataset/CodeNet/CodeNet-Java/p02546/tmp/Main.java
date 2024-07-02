import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
       String s = sc.next();
System.out.println("[INST]7;s;sc.next();"+s);
       if (s.endsWith("s")) {
System.out.println("[INST]8;None;s.endsWith('s');"+s.endsWith("s"));
           System.out.println(s + "es");
       } else {
           System.out.println(s + "s");
       }



    }

}
