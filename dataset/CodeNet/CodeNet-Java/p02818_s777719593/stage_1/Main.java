import java.util.*; 

class Main{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
        long a=sc.nextLong();
        long b=sc.nextLong();
		long k=sc.nextLong();
	
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

