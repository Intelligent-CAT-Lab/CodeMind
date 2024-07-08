import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
       String s = sc.next();
var newVariable_0 = s.endsWith("s");       if (newVariable_0) {
           System.out.println(s + "es");
       } else {
           System.out.println(s + "s");
       }



    }

}
