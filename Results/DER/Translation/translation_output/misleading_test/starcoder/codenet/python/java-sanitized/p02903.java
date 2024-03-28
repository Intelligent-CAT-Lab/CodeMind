import java.util.*;
public class p02903 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        for(int i=0;i<h;i++){
            if(i<b){
                System.out.println(new String(new char[a]).replace("\0", "1")+new String(new char[w-a]).replace("\0", "0"));
            }else{
                System.out.println(new String(new char[a]).replace("\0", "0")+new String(new char[w-a]).replace("\0", "1"));
            }
        }
    }
}