import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String[] array = s.split("");

var newVariable_0 = s.length();        for(int i = 0; i < newVariable_0; i += 2){
            System.out.print(array[i]);
        }
        
    }
}