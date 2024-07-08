import java.util.*;  

public class Main {	
    public static Long gcd(Long x,Long y){
        if(x < y) return gcd(y, x);
        if(y == 0) return x;
        return gcd(y, x % y);
    }
    public static Long lcm(Long x,Long y){                                                              
        return x*y/gcd(x,y);                                                                                                                                                                                                                
    }
    public static Long df(Long x){                                                              
        if(x==0) return x+1; 
        return 5*df(x-1);
    }
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Long a = sc.nextLong();
        Long b = a-a;
        Long c = b;
        for (Long i=b;df(i+1)<=a/2;i++){c+=(a/2)/df(i+1);}
		System.out.println(c*((a+1)%2));   
	}   
}

