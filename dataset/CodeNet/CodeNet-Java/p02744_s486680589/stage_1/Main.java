import java.util.*; import java.io.*; import java.math.*;
public class Main{
	static int N;
	static String[] s = "abcdefghijklmnopqrstuvwxyz".split("");
	static ArrayList<String> output = new ArrayList<>();
	static void solve(){//Here is the main function
		N = nextInt();
		dfs(new ArrayList(), 0);
		Collections.sort(output);
		myout(myconv(output, 9));
	}
	//Method addition frame start

static void dfs(ArrayList<String> list, int max){
var newVariable_0 = list.size();	if(newVariable_0 == N){
		output.add(myconv(list, 0));
		return;
	}
	for(int i = 0; i <= max; i++){
var newVariable_1 = list.clone();		ArrayList<String> tmp = (ArrayList<String>)newVariable_1;
var newVariable_2 = tmp.add(s[i]);var newVariable_3 = Math.max(max, i + 1);		dfs(tmp, newVariable_3);
	}
}

	//Method addition frame end

	//Don't have to see. start------------------------------------------
	static class InputIterator{
		ArrayList<String> inputLine = new ArrayList<String>(1024);
		int index = 0; int max; String read;
		InputIterator(){
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			try{
				while((read = br.readLine()) != null){
var newVariable_4 = inputLine.add(read);				}
			}catch(IOException e){}
			max = inputLine.size();
		}
		boolean hasNext(){return (index < max);}
		String next(){
			if(hasNext()){
var newVariable_5 = inputLine.get(index++);				return newVariable_5;
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
var newVariable_6 = input.size();		ArrayList<String> input = nextStrArray(); ArrayList<Integer> ret = new ArrayList<Integer>(newVariable_6);
var newVariable_7 = input.size();		for(int i = 0; i < newVariable_7; i++){
var newVariable_8 = ret.add(Integer.parseInt(input.get(i)));var newVariable_9 = Integer.parseInt(input.get(i));var newVariable_10 = input.get(i);			ret.add(Integer.parseInt(newVariable_10));
		}
		return ret;
	}
	static ArrayList<Long> nextLongArray(){
var newVariable_11 = input.size();		ArrayList<String> input = nextStrArray(); ArrayList<Long> ret = new ArrayList<Long>(newVariable_11);
var newVariable_12 = input.size();		for(int i = 0; i < newVariable_12; i++){
var newVariable_13 = ret.add(Long.parseLong(input.get(i)));var newVariable_14 = Long.parseLong(input.get(i));var newVariable_15 = input.get(i);			ret.add(Long.parseLong(newVariable_15));
		}
		return ret;
	}
	@SuppressWarnings("unchecked")
	static String myconv(Object list, int no){//only join
		String joinString = CONVSTR.get(no);
		if(list instanceof String[]){
var newVariable_16 = String.join(joinString, (String[])list);			return newVariable_16;
		}else if(list instanceof ArrayList){
var newVariable_17 = String.join(joinString, (ArrayList)list);			return newVariable_17;
		}else{
			throw new ClassCastException("Don't join");
		}
	}
	static ArrayList<String> myconv(String str, int no){//only split
		String splitString = CONVSTR.get(no);
var newVariable_18 = Arrays.asList(str.split(splitString));var newVariable_19 = str.split(splitString);		return new ArrayList<String>(Arrays.asList(newVariable_19));
	}
	public static void main(String[] args){
var newVariable_20 = CONVSTR.put(8, " ");var newVariable_21 = CONVSTR.put(9, "\n");var newVariable_22 = CONVSTR.put(0, "");		CONVSTR.put(8, " "); CONVSTR.put(9, "\n"); newVariable_22;
		solve();flush();
	}
	//Don't have to see. end------------------------------------------
}
