import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    private static final int MAX = 100+24;
    private static final int[] price=new int[]{10,5,1};
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        while(in.hasNext()) {
            int n=in.nextInt(),y=in.nextInt(),i,j,k;
            y /= 1000;
            boolean flag=false;
            for(i=0;i<=y/price[0]&&!flag;i++){
                for(j=0;j<=(y-price[0]*i)/price[1]&&!flag;j++) {
                    int need=y-price[0]*i-price[1]*j;
                    if(i+j+need==n){
                        flag=true;
                        out.println(i+" "+j+" "+need);
                    }
                }
            }
            if(!flag){
                out.println("-1 -1 -1");
            }
            out.flush();
        }
        in.close();
        out.close();
    }

}
