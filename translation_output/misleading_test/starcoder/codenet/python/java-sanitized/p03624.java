import java.util.*;
public class p03624 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] s2 = s.toCharArray();
        Arrays.sort(s2);
        char[] s3 = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        if(Arrays.equals(s2,s3)){
            System.out.println("None");
        }else{
            for(int i=0;i<s3.length;i++){
                if(s2[i]!= s3[i]){
                    System.out.println(s3[i]);
                    break;
                }
                if(i == s3.length-1){
                    System.out.println(s3[i+1]);
                }
            }
        }
    }
}