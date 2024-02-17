import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

    	Main main=new Main();

    	main.run();

    }

    void run() {

    	Scanner sc=new Scanner(System.in);

    	int A=sc.nextInt();
    	int B=sc.nextInt();
    	int C=sc.nextInt();
    	int D=sc.nextInt();
    	int E=sc.nextInt();
    	int F=sc.nextInt();

    	Set<Integer> water=new TreeSet<Integer>();

    	for(int i=0;i<=F/(100*A);i++) {
    		for(int j=0;j<=F/(100*B);j++) {

    			int buf=100*A*i+100*B*j;

    			if(buf<=F) {
    				water.add(buf);
    			}

    		}
    	}

    	Set<Integer> sugar=new TreeSet<Integer>();

    	for(int i=0;i<=F/C;i++) {
    		for(int j=0;j<=F/D;j++) {

    			int buf=C*i+D*j;

    			if(buf<=F) {
    				sugar.add(buf);
    			}

    		}
    	}

    	double  max=-999;
    	double den=0;
    	double denE=getD(100,E);

    	int satoumizu=0;
    	int satou=0;
    	for(Integer w:water) {
    		for(Integer s:sugar) {

    			if(w+s<=F) {
    				den=getD(w,s);

    				if(den!=-1 && den<=denE) {

    					if(max<den) {
    						max=den;

    						satoumizu=w+s;
    						satou=s;
    					}
    				}
    			}


    		}
    	}

    	System.out.println(satoumizu+" "+satou);






    }

    public static double getD(int water,int sugar) {

    	double den=-1;
    	if(water!=0) {
    		den=(double)(100*sugar);
    		den/=(double)(water+sugar);
    	}
    	return den;
    }
}
