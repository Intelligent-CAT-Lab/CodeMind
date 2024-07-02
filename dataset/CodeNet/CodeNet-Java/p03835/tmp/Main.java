import java.util.*;

public class Main{

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        // input
        int k = scan.nextInt();
System.out.println("[INST]8;k;scan.nextInt();"+k);
        int s = scan.nextInt();
System.out.println("[INST]9;s;scan.nextInt();"+s);


        // search
        int count = 0;
        for(int x = 0; x <= k; x++){
            for(int y = 0; y <= k; y++){
                int z = s - x - y;
                if(z >= 0 && z <= k){
                    count++;
                }
            }
        }


        // answer
        System.out.println(count);

    }
}