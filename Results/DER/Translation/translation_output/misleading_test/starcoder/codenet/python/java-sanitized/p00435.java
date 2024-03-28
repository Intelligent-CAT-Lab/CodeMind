import java.util.*;
public class p00435 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        char[] arr=s.toCharArray();
        for(int i=0;i<arr.length;i++){
            if(arr[i]=='C'){
                arr[i]='Z';
            }
            else if(arr[i]=='B'){
                arr[i]='Y';
            }
            else if(arr[i]=='A'){
                arr[i]='X';
            }
            else{
                arr[i]=(char)(arr[i]-3);
            }
        }
        System.out.println(String.valueOf(arr));
    }
}