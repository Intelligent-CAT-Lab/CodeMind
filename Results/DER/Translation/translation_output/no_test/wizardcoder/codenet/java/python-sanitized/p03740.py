import java.util.Scanner;

public class p03740 {
    public static void main(String[] args) {
        try{
            Scanner sc  = new Scanner(System.in);
            System.out.println(abs(sc.nextLong() - sc.nextLong()) <= 1? "Brown" : "Alice");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}




import java.util.Scanner;

public class p03740 {
    public static void main(String[] args) {
        try{
            Scanner sc  = new Scanner(System.in);
            long a = sc.nextLong();
            long b = sc.nextLong();
            if abs(a - b) <= 1:
                print("Brown")
            else:
                print("Alice")
        }catch(Exception e):
            e.printStackTrace();
    }
}