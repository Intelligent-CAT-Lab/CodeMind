import java.util.Scanner;

public class p02987 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        char[] arr = input.toCharArray();
        int flag = 0;
        if(arr[0]==arr[1] && arr[2]==arr[3]):
            flag = 1;
        else if(arr[0]==arr[2] && arr[1]==arr[3]):
            flag = 1;
        else if(arr[0]==arr[3] && arr[1]==arr[2]):
            flag = 1;
        else:
            flag = 0;
        if(arr[0]==arr[1] && arr[0]==arr[2] && arr[0]==arr[3]):
            flag = 0;
        if(flag==1):
            System.out.println("Yes");
        else:
            System.out.println("No");
    }
}