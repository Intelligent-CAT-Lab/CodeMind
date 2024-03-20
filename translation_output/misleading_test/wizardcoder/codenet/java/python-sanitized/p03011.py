import java.util.Scanner;

class p03011{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      	int P,Q,R;
      	int max = 0;
      	P = sc.nextInt();
      	Q = sc.nextInt();
      	R = sc.nextInt();

      	if(P >= Q):
        	if(P >= R):
            	max = Q + R;
            else:
            	max = P + Q;
        elif(Q >= R):
					if(Q >= P):
							max = P + R;
					else:
							max = Q + R;
			elif(R >= P) :
					if(R >= Q) :
							max = P + Q;
					else :
							max = P + R;

      	System.out.println(max);
    }
}