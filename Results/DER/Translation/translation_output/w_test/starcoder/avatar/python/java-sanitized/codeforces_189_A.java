import java.util.*;
public class codeforces_189_A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[4];
        for(int i=0;i<4;i++)
            arr[i] = sc.nextInt();
        Arrays.sort(arr);
        int ans = 0;
        if(arr[0]==arr[1])
        {
            for(int i=0;i<=arr[2];i++)
            {
                if(arr[0]*i<=arr[2])
                {
                    if(arr[0]*i+arr[2]*(arr[2]/arr[0])==arr[2])
                        ans = Math.max(ans,arr[2]/arr[0]+i);
                }
            }
        }
        else
        {
            for(int i=0;i<=arr[2];i++)
            {
                for(int j=0;j<=arr[1];j++)
                {
                    if(arr[0]*i+arr[1]*j<=arr[2])
                    {
                        if(arr[0]*i+arr[1]*j+arr[2]*(arr[2]/(arr[0]*arr[1]))==arr[2])
                            ans = Math.max(ans,arr[2]/(arr[0]*arr[1])+i+j);
                    }
                }
            }
        }
        System.out.println(ans);
    }
}