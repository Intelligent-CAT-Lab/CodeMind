import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner stdIn=new Scanner(System.in);

        long x=stdIn.nextLong();
System.out.println("[INST]7;x;stdIn.nextLong();"+x);
        int count=0;

        long a=100;
        while(true){
            if(a>=x){
                break;
            }
            a=a+a/100;
            count++;
        }
        System.out.println(count);
        
    }

}