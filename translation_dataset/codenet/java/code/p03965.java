import java.util.*;
 
public class p03965 {
	public static void main(String[] args) {
 
		Scanner sc  = new Scanner(System.in);



        String s1 = sc.next();
      int won  = 0;
      int lose = 0;
      int g = 0;
      int p = 0;
      
      for(int i = 0; i < s1.length(); i++){
          
          if(s1.charAt(i)=='g')
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