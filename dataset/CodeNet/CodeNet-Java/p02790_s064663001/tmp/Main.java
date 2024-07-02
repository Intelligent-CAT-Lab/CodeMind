    import java.util.Scanner;
     
     
    public class Main {
        

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int a =sc.nextInt();
System.out.println("[INST]8;a;sc.nextInt();"+a);
            int b =sc.nextInt();
System.out.println("[INST]9;b;sc.nextInt();"+b);
            
           

           if (a<b){
             for (int i=0;i<b;i++){
               System.out.print(a);
            }
            
           }else if(b<a){
             for (int i=0;i<a;i++){
                 System.out.print(b);
            }
           
           }else if(a==b){
             for (int i=0;i<a;i++){
                  System.out.print(a);
            }
            
           }
            
           } 
       }
        
    
