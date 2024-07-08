import java.util.*;

class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int result = 0;

        result = A - (2 * B);
        if(result <= 0){
            result = 0;
        }
        System.out.println(result);
    }
}