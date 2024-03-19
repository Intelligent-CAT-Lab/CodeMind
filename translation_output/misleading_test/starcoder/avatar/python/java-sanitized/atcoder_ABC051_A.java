import java.util.*;
public class atcoder_ABC051_A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] arr = s.split(", ");
        for(int i=0;i<arr.length;i++){
            arr[i] = arr[i].replace(" ", " ");
        }
        String res = "";
        for(int i=0;i<arr.length;i++){
            res += arr[i].substring(0,1).toUpperCase()+arr[i].substring(1,arr[i].length())+" ";
        }
        System.out.println(res.substring(0,res.length()-1));
    }
}