import java.util.Scanner;

class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      	int P,Q,R;
      	int max = 0;
      	P = sc.nextInt();
System.out.println("[INST]7;P;sc.nextInt();"+P);
      	Q = sc.nextInt();
System.out.println("[INST]8;Q;sc.nextInt();"+Q);
      	R = sc.nextInt();
System.out.println("[INST]9;R;sc.nextInt();"+R);

      	if(P >= Q){
        	if(P >= R){
            	max = Q + R;
            }else{
            	max = P + Q;
            }
        }else if(Q >= R){
					if(Q >= P){
							max = P + R;
					}else{
							max = Q + R;
					}
			}else if(R >= P) {
					if(R >= Q) {
							max = P + Q;
					}else {
							max = P + R;
					}
			}

      	System.out.println(max);
    }
}
