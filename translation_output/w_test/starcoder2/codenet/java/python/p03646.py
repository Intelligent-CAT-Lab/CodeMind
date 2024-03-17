

```python
import sys

def solve():
    K = int(input())
    N = 50
    list = [K // N + i for i in range(N)]
    for i in range(K % N):
        list[i % N] += N + 1
        for j in range(N):
            list[j] -= 1
    print(N)
    print(' '.join(map(str, list)))

solve()
```

## 03647

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1000000000000000000

Expected output:
1000000000000000000


```
import java.util.*; import java.io.*; import java.math.*;
public class p03647{
    static void solve(){//Here is the main function
        long N = nextLong();
        long[] list = new long[1000000000];
        for(int i = 0; i < 1000000000; i++){
            list[i] = i;
        }
        long ans = 0;
        for(int i = 0; i < 1000000000; i++){
            ans += list[i];
        }
        myout(ans);
    }
    //Method addition frame start



    //Method addition frame end

    //Don't have to see. start------------------------------------------
    static class InputIterator{
        ArrayList<String> inputLine = new ArrayList<String>(1024);
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
            }
        }
    }
    static HashMap<Integer, String> CONVSTR = new HashMap<Integer, String>();
    static InputIterator ii = new InputIterator();//This class cannot be used in reactive problem.
    static PrintWriter out = new PrintWriter(System.out);
    static void flush(){out.flush();}
    static void myout(Object t){out.println(t);}
    static void myerr(Object t){System.err.print("debug:");System.err.println(t);}
    static String next(){return ii.next();}
    static boolean hasNext(){return ii.hasNext();}
    static int nextInt(){return Integer.parseInt(next());}
    static long nextLong(){return Long.parseLong(next());}
    static double nextDouble(){return Double.parseDouble(next());}
    static ArrayList<String> nextStrArray(){return myconv(next(), 8);}
    static ArrayList<String> nextCharArray(){return myconv(next(), 0);}
    static ArrayList<Integer> nextIntArray(){
        ArrayList<String> input = nextStrArray(); ArrayList<Integer> ret = new ArrayList<Integer>(input.size());
        for(int i = 0; i < input.size(); i++){
            ret.add(Integer.parseInt(input.get(i)));
        }
        return ret;
    }
    static ArrayList<Long> nextLongArray(){
        ArrayList<String> input = nextStrArray(); ArrayList<Long> ret = new ArrayList<Long>(input.size());
        for(int i = 0; i < input.size(); i++){
            ret.add(Long.parseLong(input.get(i)));
        }
        return ret;
    }
    @SuppressWarnings("unchecked")
    static String myconv(Object list, int no){//only join
        String joinString = CONVSTR
