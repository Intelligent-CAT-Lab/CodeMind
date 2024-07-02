//8-A
import java.util.Scanner;

class Main {
    public static void main(String [] args){
    	
    	Scanner sc = new Scanner(System.in);

        String n = sc.nextLine();
System.out.println("[INST]8;n;sc.nextLine();"+n);
        
        int num = n.length();
System.out.println("[INST]10;num;n.length();"+num);
        
        for( int i = 0 ; i < num ; i++ ){
        	
        	if(Character.isLowerCase(n.charAt(i))){
System.out.println("[INST]14;None;Character.isLowerCase(n.charAt(i));"+Character.isLowerCase(n.charAt(i)));
System.out.println("[INST]14;None;n.charAt(i);"+n.charAt(i));
        		
                System.out.print(Character.toUpperCase(n.charAt(i)));
                
            }else if(Character.isUpperCase(n.charAt(i))){
System.out.println("[INST]18;None;Character.isUpperCase(n.charAt(i));"+Character.isUpperCase(n.charAt(i)));
System.out.println("[INST]18;None;n.charAt(i);"+n.charAt(i));
            	
                System.out.print(Character.toLowerCase(n.charAt(i)));
                
            }/*else if( n.charAt(i) == ' '){
            	
            	System.out.print(' ');
            	
            }*/else{
            	
                System.out.print(n.charAt(i));
                
            }
        	
        }
        
        System.out.println();
    }
}