import java.util.*;
import java.io.*;

public class p01751{
    static final Scanner sc = new Scanner(System.in);
    static final PrintWriter out = new PrintWriter(System.out,false);

    public static void main(String[] args) throws Exception {
    	int a = sc.nextInt();
    	int b = sc.nextInt();
    	int c = sc.nextInt();
    	int d = a + b;
    	int e = -1;
    	for(int i=0;i<1000;i++){
    		if(0<=(60*i+c)%d && (60*i+c)%d<=a){
    			e = i;
    			break;
    		}
    	}
    	if(e==-1){
    		out.println(-1);
    	}
    	else{
    		out.println(60*e+c);
    	}
    	out.flush();
        sc.close();
        out.close();
    }

    static void trace(Object... o) { System.out.println(Arrays.deepToString(o));}
}