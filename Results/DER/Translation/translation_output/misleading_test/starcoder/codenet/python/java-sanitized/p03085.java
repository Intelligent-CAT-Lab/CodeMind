import java.util.*;
public class p03085 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char a=sc.next().charAt(0);
        if(a=='A'){
            System.out.println("T");
        }
        else if(a=='C'){
            System.out.println("G");
        }
        else if(a=='G'){
            System.out.println("C");
        }
        else{
            System.out.println("A");
        }
    }
}