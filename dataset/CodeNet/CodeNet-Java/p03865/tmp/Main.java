import java.util.*;

public class Main {
	public static void main(String[] args) {
              Scanner sc = new Scanner(System.in);
                        
               String s = sc.next();
System.out.println("[INST]6;s;sc.next();"+s);
               
               int a = s.length();
System.out.println("[INST]8;a;s.length();"+a);
               
               boolean flag = true;
               
               if(s.charAt(0) == s.charAt(a-1)){
System.out.println("[INST]12;None;s.charAt(0);"+s.charAt(0));
System.out.println("[INST]12;None;s.charAt(a-1);"+s.charAt(a-1));
                    if(a%2 == 1){
                        flag = false;
                    }else{
                        flag = true;
                    }
               }else{
                   if(a%2 == 1){
                       flag = true;
                   }else{
                       flag = false;
                   }                                      
               }                             
                                                                                    
               if(flag){
                   System.out.println("First");
               }else{
                   System.out.println("Second");
               }           
                            
        }       
}

        