import java.util.Scanner;


public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
System.out.println("[INST]6;a;sc.nextInt();"+a);
        int b=sc.nextInt();
System.out.println("[INST]7;b;sc.nextInt();"+b);
        int aa=String.valueOf(a).length();
System.out.println("[INST]8;aa;String.valueOf(a).length();"+aa);
System.out.println("[INST]8;None;String.valueOf(a);"+String.valueOf(a));
        int bb=String.valueOf(b).length();
System.out.println("[INST]9;bb;String.valueOf(b).length();"+bb);
System.out.println("[INST]9;None;String.valueOf(b);"+String.valueOf(b));
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