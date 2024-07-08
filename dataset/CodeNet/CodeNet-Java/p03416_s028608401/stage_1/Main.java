import java.util.*;
class Main{

     public static void main(String []args){
        //System.out.println("Hello World");
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        int count2 = 0 ;
        for(int i = x ; i<=y ;i++){
            int k = 1 ;
            int count = 0 ;
var newVariable_0 = String.valueOf(i);            char[] arr = newVariable_0.toCharArray();
            for(int j= 0 ; j<=arr.length/2 ; j++){
                
                if(arr[j] == arr[arr.length-k]){
                    count++ ; 
                }
                k++;
            }
var newVariable_1 = Math.ceil(arr.length/2.0);            if(count == newVariable_1){
                count2++ ;
            }
        }
        
        System.out.println(count2);
     }
}