import java.util.*;
public class p00111 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] tableA = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
        String[] tableB = {" ","?",".","-","'","101","000000","000011","10010001","010001","000001","100101","10011010","0101","0001","110","01001","10011011","010000","0111","10011000","0110","00100","10011001","10011110","00101","111","10011111","1000","00110","00111","10011100","10011101","000010","10010010","10010011","10010000"};
        String ans = "";
        for(int i=0;i<s.length();i++){
            ans += tableA[Integer.parseInt(s.substring(i,i+1))];
        }
        for(int i=0;i<ans.length();i++){
            System.out.print(tableB[Integer.parseInt(ans.substring(i,i+1))]);
        }
    }
}