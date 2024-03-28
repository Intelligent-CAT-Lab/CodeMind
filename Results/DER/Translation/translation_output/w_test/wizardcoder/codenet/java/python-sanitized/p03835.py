import java.util.*;

public class p03835{

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        // input
        int k = scan.nextInt();
        int s = scan.nextInt();


        // search
        int count = 0;
        for(int x = 0; x <= k; x++){
            for(int y = 0; y <= k; y++){
                int z = s - x - y;
                if(z >= 0 and z <= k):
                    count++;
            }
        }


        // answer
        System.out.println(count);

    }
}


- In Python, the `and` operator is used instead of the `&&` operator.
- In Python, the `:` is used to indicate the end of a line inside a `for` loop.