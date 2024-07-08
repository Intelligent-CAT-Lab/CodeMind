import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
var newVariable_0 = sc.next();        int h = Integer.parseInt(newVariable_0);
var newVariable_1 = sc.next();        int w = Integer.parseInt(newVariable_1);
var newVariable_2 = sc.next();        int a = Integer.parseInt(newVariable_2);
var newVariable_3 = sc.next();        int b = Integer.parseInt(newVariable_3);
        
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < b; i++){
            for(int j = 0; j < a; j++){
var newVariable_4 = sb.append("0");            }
            for(int j = 0; j < (w-a); j++){
var newVariable_5 = sb.append("1");            }
var newVariable_6 = sb.append(System.lineSeparator());var newVariable_7 = System.lineSeparator();            sb.append(newVariable_7);
        }
        for(int i = 0; i < (h-b); i++){
            for(int j = 0; j < a; j++){
var newVariable_8 = sb.append("1");            }
            for(int j = 0; j < (w-a); j++){
var newVariable_9 = sb.append("0");            }
var newVariable_10 = sb.append(System.lineSeparator());var newVariable_11 = System.lineSeparator();            sb.append(newVariable_11);
        }
        
        System.out.println(sb);
    }
}