import java.util.*;
class Main{

     public static void main(String []args){
        //System.out.println("Hello World");
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
System.out.println("[INST]6;x;scan.nextInt();"+x);
        int y = scan.nextInt();
System.out.println("[INST]7;y;scan.nextInt();"+y);
        int count2 = 0 ;
        for(int i = x ; i<=y ;i++){
            int k = 1 ;
            int count = 0 ;
            char[] arr = String.valueOf(i).toCharArray();
System.out.println("[INST]12;arr;String.valueOf(i).toCharArray();"+arr);
System.out.println("[INST]12;None;String.valueOf(i);"+String.valueOf(i));
            for(int j= 0 ; j<=arr.length/2 ; j++){
                
                if(arr[j] == arr[arr.length-k]){
                    count++ ; 
                }
                k++;
            }
            if(count == Math.ceil(arr.length/2.0)){
System.out.println("[INST]20;None;Math.ceil(arr.length/2.0);"+Math.ceil(arr.length/2.0));
                count2++ ;
            }
        }
        
        System.out.println(count2);
     }
}