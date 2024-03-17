

```python
import sys

def solve():
    N, d = map(int, input().split())
    if N <= 2:
        print(0)
        return
    N -= 3
    loop = N // 11
    amari = N % 11
    map = [[1,1,1,2,2,3,4,4,5,5,5], [0,1,2,2,3,3,3,4,4,4,5], [1,1,1,2,2,2,3,3,4,5,5],
                    [0,0,1,1,2,3,3,4,4,4,5], [1,2,2,3,3,3,4,4,4,5,5], [0,0,1,1,1,2,2,3,4,4,5],
                    [0,1,1,2,3,3,4,4,4,5,5], [1,1,2,2,2,3,3,3,4,4,5], [0,1,1,1,2,2,3,4,4,5,5],
                    [1,1,2,3,3,4,4,4,5,5,5], [0,1,1,1,2,2,2,3,3,4,5]]
    print(loop * 5 + map[d][amari])

solve()
```

## 03930

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1000000000000000000

Expected output:
1000000000000000000


```
import java.util.*; import java.io.*; import java.math.*;
public class p03930{
    static void solve(){//Here is the main function
      ArrayList<Integer> one = nextIntArray();
      int N = one.get(0);
      int[] dp = new int[N + 1];
      dp[0] = 1;
      for(int i = 1; i <= N; i++){
        if(i >= 1){
          dp[i] += dp[i - 1];
        }
        if(i >= 2){
          dp[i] += dp[i - 2];
        }
        if(i >= 3){
          dp[i] += dp[i - 3];
        }
        dp[i] %= 1000000007;
      }
      myout(dp[N]);
    }
    //Method addition frame start



    //Method addition frame end

    //Don't have to see. start------------------------------------------
    static class InputIterator{
        ArrayList<String> inputLine = new ArrayList<>(1024);
        int index = 0; int max; String read;
        InputIterator(){
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            try{
                while((read = br.readLine()) != null){
                    inputLine.add(read);
                }
            }catch(IOException e){}
            max = inputLine.size();
        }
        boolean hasNext(){return (index < max);}
        String next(){
            if(hasNext()){
                return inputLine.get(index++);
            }else{
                throw new IndexOutOfBoundsException("There is no more input");
            
