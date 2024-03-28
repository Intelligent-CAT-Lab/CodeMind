<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
0

Expected output:
4
3 3 3 3


```
import java.util.*; import java.io.*; import java.math.*;
public class p03646{
	static void solve(){//Here is the main function
		long K = nextLong();
		int N = 50;
		long[] list = new long[N];
		for(int i = 0; i < N; i++){
			list[i] = K / N + i;
		}
		for(int i = 0; i < K % N; i++){
			list[i % N] += N + 1;
			for(int j = 0; j < N; j++){
				list[j]--;
			}
		}
		myout(N);
		String[] output = new String[N];
		for(int i = 0; i < N; i++){
			output[i] = Long.toString(list[i]);
		}
		myout(myconv(output, 8));
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
		String joinString = CONVSTR.get(no);
		if(list instanceof String[]){
			return String.join(joinString, (String[])list);
		}else if(list instanceof ArrayList){
			return String.join(joinString, (ArrayList)list);
		}else{
			throw new ClassCastException("Don't join");
		}
	}
	static ArrayList<String> myconv(String str, int no){//only split
		String splitString = CONVSTR.get(no);
		return new ArrayList<String>(Arrays.asList(str.split(splitString)));
	}
	public static void main(String[] args){
		CONVSTR.put(8, " "); CONVSTR.put(9, "\n"); CONVSTR.put(0, "");
		solve();flush();
	}
	//Don't have to see. end------------------------------------------
}

```

@@ Response
Here is the translated Python code:

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
    output = [str(i) for i in list]
    print(' '.join(output))

if __name__ == "__main__":
    solve()
```

This Python code does the same thing as the Java code. It reads an integer from the standard input, calculates the list of numbers, and then prints the list. The `print` function in Python is equivalent to `myout` in Java. The `input` function is equivalent to `next` in Java. The `//` operator is equivalent to `/` in Java, but it performs integer division. The `%` operator is the modulus operator. The `for` loop is similar to the Java one. The `range` function is similar to the Java one. The `list` is similar to the Java array. The `str` function is used to convert a number to a string. The `join` function is used to concatenate a list of strings with a separator. The `if __name__ == "__main__":` is a common idiom in Python to make sure the code is only executed when the script is run directly, not when it's imported as a module.<｜end▁of▁sentence｜>
