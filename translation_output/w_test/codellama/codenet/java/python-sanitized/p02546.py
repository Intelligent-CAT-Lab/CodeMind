import java.util.Scanner;

public class p02546 {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
       String s = sc.next();
       if (s.endsWith("s")) {
           System.out.println(s + "es");
       } else {
           System.out.println(s + "s");
       }



    }

}




import sys

s = sys.stdin.readline().strip()
if s.endswith("s"):
    print(s + "es")
else:
    print(s + "s")