
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Point2D.Double;
import java.util.*;
  
public class Main {
    Scanner sc = new Scanner(System.in);
  
    public static void main(String[] args) {
        new Main(); 
    }
  
    public Main() {
        new aoj1157().doIt();
    }
    class aoj1157{
    	void doIt(){
    		String str = sc.next();
    		char ctr[] = str.toCharArray();
    		int num[] = new int [12];
    		int v = 0;
    		int cnt = 0;
    		int ans = 0;
    		for(int i = 0;i < ctr.length;i++){
    			if(ctr[i] == '?'){
    				v = 11 - i;
    			}else{
    				num[11 - i] = ctr[i] - '0';
    			}
    		}
    		for(int i = 0;i < 10;i++){
    			int sum = 0;int q = 0;
    			num[v] = i;
    			for(int j = 1;j < 12;j++){
    				if(j <= 6)q = j + 1;
    				else q = j - 5;
    				sum = sum + q*num[j];
    			}
//    			System.out.print(sum);
    			if(sum % 11 == 1)sum = 0;
    			else sum = sum % 11;
    			if((11 - sum)%11 == num[0]){
    				cnt++;
    				ans = i;
    			}
//    			System.out.println(" "+(11 - sum));
    		}
    		if(cnt == 1)System.out.println(ans);
    		else System.out.println("MULTIPLE");
    	}
    }
}