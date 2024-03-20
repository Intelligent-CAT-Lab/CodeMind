import java.util.Scanner;

class p02694 {

    public static void main(String[] args) {
        Scanner stdIn=new Scanner(System.in);

        long x=stdIn.nextLong();
        int count=0;

        long a=100;
        while(True):
            if(a>=x):
                break;
            a=a+a/100;
            count++;
        endwhile
        System.out.println(count);
        
    }

}