
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
System.out.println("[INST]8;N;sc.nextLong();"+N);
        long A = sc.nextLong();
System.out.println("[INST]9;A;sc.nextLong();"+A);
        long B = sc.nextLong();
System.out.println("[INST]10;B;sc.nextLong();"+B);


                if(A==B){
                    System.out.println(0);
                 }else if((B-A)%2 ==0){

                    System.out.println((B-A)/2);

                }else{

                    if((A-1)<(N-B)){
                        System.out.println((A+B-1)/2);
                    }else{
                        System.out.println((N*2-A-B+1)/2);
                    }
                }



            }

        }
