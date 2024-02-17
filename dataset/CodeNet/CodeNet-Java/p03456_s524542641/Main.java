import java.util.Scanner;


public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int aa=String.valueOf(a).length();
        int bb=String.valueOf(b).length();
        if((aa==1&&bb==1)||(aa==2&&bb==1)||(aa==3&&bb==1)){
          int c=10*a+b;
         for(int i=0;i<c;i++){
            if(i*i==c){
                System.out.println("Yes");
                break;
            }else if(i==c-1){
                System.out.println("No");
            }
        
        }
}
        if((aa==1&&bb==2)||(aa==2&&bb==2)||(aa==3&&bb==2)){
            int c=100*a+b;
            for(int i=0;i<c;i++){
                if(i*i==c){
                    System.out.println("Yes");
                    break;
                }else if(i==c-1){
                    System.out.println("No");
                }
            
            }
    }
        
        if((aa==1&&bb==3)||(aa==2&&bb==3)||(aa==3&&bb==3)){
            int c=1000*a+b;
            for(int i=0;i<c;i++){
                if(i*i==c){
                    System.out.println("Yes");
                    break;
                }else if(i==c-1){
                    System.out.println("No");
                }
            
            }
    }
        

        


    }
}