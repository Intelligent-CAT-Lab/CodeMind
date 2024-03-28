import java.util.*;
public class p03835 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        int s=sc.nextInt();
        int sum=0;
        for(int z=0;z<=k;z++){
            for(int y=0;y<=k;y++){
                if(0<=s-y-z<=k)
                    sum++;
            }
        }
        System.out.println(sum);
    }
}