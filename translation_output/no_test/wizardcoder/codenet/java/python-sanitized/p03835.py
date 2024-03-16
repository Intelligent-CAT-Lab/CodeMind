import java.util.*;

public class p03835{

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        // input
        int k = scan.nextInt();
        int s = scan.nextInt();


        // search
        int count = 0;
        for x in range(k+1):
            for y in range(k+1):
                z = s - x - y;
                if z >= 0 and z <= k:
                    count += 1;

        // answer
        System.out.println(count);

    }
}