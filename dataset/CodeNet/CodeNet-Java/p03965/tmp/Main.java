import java.util.*;
 
public class Main {
	public static void main(String[] args) {
 
		Scanner sc  = new Scanner(System.in);



        String s1 = sc.next();
System.out.println("[INST]9;s1;sc.next();"+s1);
      int won  = 0;
      int lose = 0;
      int g = 0;
      int p = 0;
      
      for(int i = 0; i < s1.length(); i++){
System.out.println("[INST]15;None;s1.length();"+s1.length());
          
          if(s1.charAt(i)=='g')
System.out.println("[INST]17;None;s1.charAt(i);"+s1.charAt(i));
          {
            if(p==g)
            {
                g++;
                
            }else if(p < g){
                p++;
                won++;
            }
            
            
            
          }
          else if(s1.charAt(i)=='p')
System.out.println("[INST]31;None;s1.charAt(i);"+s1.charAt(i));
          {
            if(p==g)
            {
                g++;
                lose++;
                
            }else if(p < g){
                p++;
            }else{
                g++;
                lose++;
            }
          }
          
      }

//System.out.print(won);
//System.out.print(lose);

        System.out.print(won-lose);
        System.out.println();
	}
}