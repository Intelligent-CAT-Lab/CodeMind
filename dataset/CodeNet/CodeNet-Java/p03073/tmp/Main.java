
import java.util.Scanner;

/**
 *
 * @author cs18097
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String tail = sc.next();
System.out.println("[INST]15;tail;sc.next();"+tail);
        int n = tail.length();//桁数
System.out.println("[INST]16;n;tail.length();"+n);
        String[] tailsp = tail.split("");
System.out.println("[INST]17;tailsp;tail.split('');"+tailsp);
        String zero= "0";
        String one ="1";
        int count=0;
        for(int i=0;i<n;i++){
            if(i%2==0&&tailsp[i].equals(zero)){
System.out.println("[INST]22;None;tailsp[i].equals(zero);"+tailsp[i].equals(zero));
                count ++;
            }
            if(i%2==1&&tailsp[i].equals(one)){
System.out.println("[INST]25;None;tailsp[i].equals(one);"+tailsp[i].equals(one));
                count ++;
            }
        }
        n -=count;
        if(count > n){
            System.out.print(n);
        }else{
            System.out.print(count);
        }
        
    }
    
}