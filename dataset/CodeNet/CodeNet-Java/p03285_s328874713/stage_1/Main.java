import java.io.*;
class Program{
    boolean fact(int n){
        int count = 0;
var newVariable_0 = Math.sqrt(n);        for(int i=1;i<=newVariable_0;i++){
            if (n%i==0){
var newVariable_1 = Math.sqrt(n);                if (i!=newVariable_1) count+=2;
                else{
var newVariable_2 = Math.pow(Math.sqrt(n),2);var newVariable_3 = Math.sqrt(n);                    if (Math.pow(newVariable_3,2)==n) count+=1;
                    else count+=2;
                }
            }
        }
        if (count==8) return true;
        else return false;
    }
}
class Main{
    public static void main(String args[])throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        Program obj = new Program();
var newVariable_4 = in.readLine();        boolean flag = false;int N = Integer.parseInt(newVariable_4);
        if (N%4==0||N%7==0) flag = true;
        else{
            for(int i =4;i<N;i+=4){
                if ( (N-i)%7==0 ){
                    flag = true; break;
                }
            }
        }
        if (flag) System.out.println("Yes");
        else System.out.println("No");
    }
}