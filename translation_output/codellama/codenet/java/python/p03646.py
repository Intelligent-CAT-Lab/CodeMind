<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

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


Translate the above java code to python.

python code:

[/INST]
```python
import java.util.*;
import java.io.*;
import java.math.*;

class p03646:
    def solve():
        K = nextLong()
        N = 50
        list = [K / N + i for i in range(N)]
        for i in range(K % N):
            list[i % N] += N + 1
            for j in range(N):
                list[j] -= 1
        myout(N)
        output = [str(list[i]) for i in range(N)]
        myout(myconv(output, 8))

    # Method addition frame start



    # Method addition frame end

    # Don't have to see. start------------------------------------------
    class InputIterator:
        inputLine = []
        index = 0
        max = 0
        read = ""

        def __init__(self):
            br = BufferedReader(InputStreamReader(System.in))
            try:
                while (read := br.readLine()) != None:
                    self.inputLine.append(read)
            except IOException:
                pass
            self.max = len(self.inputLine)

        def hasNext(self):
            return self.index < self.max

        def next(self):
            if self.hasNext():
                return self.inputLine[self.index]
            else:
                raise IndexOutOfBoundsException("There is no more input")

    CONVSTR = {}
    ii = InputIterator()  # This class cannot be used in reactive problem.
    out = PrintWriter(System.out)

    def flush():
        out.flush()

    def myout(t):
        out.println(t)

    def myerr(t):
        System.err.print("debug:")
        System.err.println(t)

    def next():
        return ii.next()

    def hasNext():
        return ii.hasNext()

    def nextInt():
        return Integer.parseInt(next())

    def nextLong():
        return Long.parseLong(next())

    def nextDouble():
        return Double.parseDouble(next())

    def nextStrArray():
        return myconv(next(), 8)

    def nextCharArray():
        return myconv(next(), 0)

    def nextIntArray():
        input = nextStrArray()
        ret = []
        for i in range(len(input)):
            ret.append(Integer.parseInt(input[i]))
        return ret

    def nextLongArray():
        input = nextStrArray()
        ret = []
        for i in range(len(input)):
            ret.append(Long.parseLong(input[i]))
        return ret

    @SuppressWarnings("unchecked")
    def myconv(list, no):  # only join
        joinString = CONVSTR.get(no)
        if isinstance(list, str):
            return String.join(joinString, list)
        elif isinstance(list, ArrayList):
            return String.join(joinString, list)
        else:
            raise ClassCastException("Don't join")

    def myconv(str, no):  # only split
        splitString = CONVSTR.get(no)
        return ArrayList(str.split(splitString))

    def main(args):
        CONVSTR.put(8, " ")
        CONV
