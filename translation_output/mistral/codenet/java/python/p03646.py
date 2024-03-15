<s> [INST] Translate the following java code to python and enclose your solution inside ```python```:
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
[/INST]
```python
import java.util
import java.io
import java.math

def solve():
    K = int(input())
    N = 50
    list = [K // N + i for i in range(N)]
    for i in range(K % N):
        list[i % N] += N + 1
        for j in range(N):
            list[j] -= 1
    print(N)
    output = [str(x) for x in list]
    print(myconv(output, 8))

def myconv(lst, no):
    if isinstance(lst, str):
        return myconv(lst.split(CONVSTR[no]), no)
    elif isinstance(lst, list):
        return myconv(lst, no)
    else:
        raise TypeError("Invalid input")

def myout(t):
    print(t)

def myerr(t):
    print("debug:", t)

def next():
    return ii.next()

def hasNext():
    return ii.hasNext()

def nextInt():
    return int(next())

def nextLong():
    return long(next())

def nextDouble():
    return float(next())

def nextStrArray():
    return nextCharArray()

def nextCharArray():
    return next()

def nextIntArray():
    return [int(x) for x in nextStrArray()]

def nextLongArray():
    return [long(x) for x in nextStrArray()]

CONVSTR = {8: " ", 9: "\n", 0: ""}
ii = InputIterator()
out = PrintWriter(sys.stdout)

def flush():
    out.flush()

def myout(t):
    out.write(t)

def myerr(t):
    print("debug:", t)

def next():
    return ii.next()

def hasNext():
    return ii.hasNext()

def nextInt():
    return nextIntArray()[0]

def nextLong():
    return nextLongArray()[0]

def nextDouble():
    return nextDoubleArray()[0]

def nextStrArray():
    return nextCharArray()

def nextCharArray():
    return next()

def nextIntArray():
    return nextStrArray()

def nextLongArray():
    return nextStrArray()

def myconv(lst, no):
    if isinstance(lst, str):
        return myconv(lst.split(CONVSTR[no]), no)
    elif isinstance(lst, list):
        return myconv(lst, no)
    else:
        raise TypeError("Invalid input")

def myconv(lst, no):
    if isinstance(lst, str):
        return myconv(lst.split(CONVSTR[no]), no)
    elif isinstance(lst, list):
        return myconv(lst, no)
    else:
        raise TypeError("Invalid input")

def main():
    CONVSTR[8] = " "
    CONVSTR[9] = "\n"
    CONVSTR[0] = ""
    solve()
    flush()

if __name__ == "__main__":
    main()
```</s>
