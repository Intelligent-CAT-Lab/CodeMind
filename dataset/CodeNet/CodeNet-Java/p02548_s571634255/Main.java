import java.util.*;

public class Main {



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N  = sc.nextInt();

        int count = 0;
        for (int A = 1; A<N  ; A++) {//A
            count+= (N-1)/A;
        }


        System.out.println(count);

    }

}
