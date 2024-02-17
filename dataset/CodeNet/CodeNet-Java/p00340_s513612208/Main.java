
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int e[] = new int[5] ;
        for(int i = 1;i<=4;i++){
            e[i] = scan.nextInt();
        }
        if(e[1]==e[2]&&e[3]==e[4]||e[1]==e[4]&&e[2]==e[3]||e[1]==e[3]&&e[2]==e[4]){
            System.out.println("yes");
    } else {
    System.out.println("no");
    }
}
}

