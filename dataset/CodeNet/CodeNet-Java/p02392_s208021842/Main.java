import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Main2 cc = new Main2();
        cc.yesNo();
    }
}

class Main2{
    public void yesNo(){
        Scanner scan = new Scanner(System.in);
        int[] abc = new int[3];
        for(int i=0; i < 3; i++){
            abc[i] = scan.nextInt();
        }
        if(abc[0] < abc[1] && abc[1] < abc[2]){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}

