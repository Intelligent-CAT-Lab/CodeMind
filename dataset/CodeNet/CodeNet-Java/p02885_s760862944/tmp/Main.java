import java.util.*;

class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
System.out.println("[INST]5;A;sc.nextInt();"+A);
        int B = sc.nextInt();
System.out.println("[INST]6;B;sc.nextInt();"+B);
        int result = 0;

        result = A - (2 * B);
        if(result <= 0){
            result = 0;
        }
        System.out.println(result);
    }
}