import java.util.*; 

class Main{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
        long a=sc.nextLong();
System.out.println("[INST]5;a;sc.nextLong();"+a);
        long b=sc.nextLong();
System.out.println("[INST]6;b;sc.nextLong();"+b);
		long k=sc.nextLong();
System.out.println("[INST]7;k;sc.nextLong();"+k);
	
 	if(k>=a){
      	b=b-(k-a);
        a=0;
    	}else{
     	a=a-k;
   	 }
	if(b<0){
    	b=0;
    }
    	System.out.println(a);
  		System.out.println(b);
    }
}

