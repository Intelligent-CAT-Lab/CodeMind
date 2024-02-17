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
            char[] arr = String.valueOf(i).toCharArray();
            for(int j= 0 ; j<=arr.length/2 ; j++){
                
                if(arr[j] == arr[arr.length-k]){
                    count++ ; 
                }
                k++;
            }
            if(count == Math.ceil(arr.length/2.0)){
                count2++ ;
            }
        }
        
        System.out.println(count2);
     }
}