import java.util.*; import java.io.*; import java.math.*;
public class Main{
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
var newVariable_0 = Long.toString(list[i]);			output[i] = newVariable_0;
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
var newVariable_1 = inputLine.add(read);				}
			}catch(IOException e){}
			max = inputLine.size();
		}
		boolean hasNext(){return (index < max);}
		String next(){
			if(hasNext()){
var newVariable_2 = inputLine.get(index++);				return newVariable_2;
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
var newVariable_3 = input.size();		ArrayList<String> input = nextStrArray(); ArrayList<Integer> ret = new ArrayList<Integer>(newVariable_3);
var newVariable_4 = input.size();		for(int i = 0; i < newVariable_4; i++){
var newVariable_5 = ret.add(Integer.parseInt(input.get(i)));var newVariable_6 = Integer.parseInt(input.get(i));var newVariable_7 = input.get(i);			ret.add(Integer.parseInt(newVariable_7));
		}
		return ret;
	}
	static ArrayList<Long> nextLongArray(){
var newVariable_8 = input.size();		ArrayList<String> input = nextStrArray(); ArrayList<Long> ret = new ArrayList<Long>(newVariable_8);
var newVariable_9 = input.size();		for(int i = 0; i < newVariable_9; i++){
var newVariable_10 = ret.add(Long.parseLong(input.get(i)));var newVariable_11 = Long.parseLong(input.get(i));var newVariable_12 = input.get(i);			ret.add(Long.parseLong(newVariable_12));
		}
		return ret;
	}
	@SuppressWarnings("unchecked")
	static String myconv(Object list, int no){//only join
		String joinString = CONVSTR.get(no);
		if(list instanceof String[]){
var newVariable_13 = String.join(joinString, (String[])list);			return newVariable_13;
		}else if(list instanceof ArrayList){
var newVariable_14 = String.join(joinString, (ArrayList)list);			return newVariable_14;
		}else{
			throw new ClassCastException("Don't join");
		}
	}
	static ArrayList<String> myconv(String str, int no){//only split
		String splitString = CONVSTR.get(no);
var newVariable_15 = Arrays.asList(str.split(splitString));var newVariable_16 = str.split(splitString);		return new ArrayList<String>(Arrays.asList(newVariable_16));
	}
	public static void main(String[] args){
var newVariable_17 = CONVSTR.put(8, " ");var newVariable_18 = CONVSTR.put(9, "\n");var newVariable_19 = CONVSTR.put(0, "");		CONVSTR.put(8, " "); CONVSTR.put(9, "\n"); newVariable_19;
		solve();flush();
	}
	//Don't have to see. end------------------------------------------
}
