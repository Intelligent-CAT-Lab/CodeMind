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
			output[i] = Long.toString(list[i]);
System.out.println("[INST]18;None;Long.toString(list[i]);"+Long.toString(list[i]));
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
System.out.println("[INST]35;read;br.readLine();"+read);
					inputLine.add(read);
System.out.println("[INST]36;None;inputLine.add(read);"+inputLine.add(read));
				}
			}catch(IOException e){}
			max = inputLine.size();
System.out.println("[INST]39;max;inputLine.size();"+max);
		}
		boolean hasNext(){return (index < max);}
		String next(){
			if(hasNext()){
				return inputLine.get(index++);
System.out.println("[INST]44;None;inputLine.get(index++);"+inputLine.get(index++));
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
System.out.println("[INST]64;None;input.size();"+input.size());
		for(int i = 0; i < input.size(); i++){
System.out.println("[INST]65;None;input.size();"+input.size());
			ret.add(Integer.parseInt(input.get(i)));
System.out.println("[INST]66;None;ret.add(Integer.parseInt(input.get(i)));"+ret.add(Integer.parseInt(input.get(i))));
System.out.println("[INST]66;None;Integer.parseInt(input.get(i));"+Integer.parseInt(input.get(i)));
System.out.println("[INST]66;None;input.get(i);"+input.get(i));
		}
		return ret;
	}
	static ArrayList<Long> nextLongArray(){
		ArrayList<String> input = nextStrArray(); ArrayList<Long> ret = new ArrayList<Long>(input.size());
System.out.println("[INST]71;None;input.size();"+input.size());
		for(int i = 0; i < input.size(); i++){
System.out.println("[INST]72;None;input.size();"+input.size());
			ret.add(Long.parseLong(input.get(i)));
System.out.println("[INST]73;None;ret.add(Long.parseLong(input.get(i)));"+ret.add(Long.parseLong(input.get(i))));
System.out.println("[INST]73;None;Long.parseLong(input.get(i));"+Long.parseLong(input.get(i)));
System.out.println("[INST]73;None;input.get(i);"+input.get(i));
		}
		return ret;
	}
	@SuppressWarnings("unchecked")
	static String myconv(Object list, int no){//only join
		String joinString = CONVSTR.get(no);
System.out.println("[INST]79;joinString;CONVSTR.get(no);"+joinString);
		if(list instanceof String[]){
			return String.join(joinString, (String[])list);
System.out.println("[INST]81;None;String.join(joinString, (String[])list);"+String.join(joinString, (String[])list));
		}else if(list instanceof ArrayList){
			return String.join(joinString, (ArrayList)list);
System.out.println("[INST]83;None;String.join(joinString, (ArrayList)list);"+String.join(joinString, (ArrayList)list));
		}else{
			throw new ClassCastException("Don't join");
		}
	}
	static ArrayList<String> myconv(String str, int no){//only split
		String splitString = CONVSTR.get(no);
System.out.println("[INST]89;splitString;CONVSTR.get(no);"+splitString);
		return new ArrayList<String>(Arrays.asList(str.split(splitString)));
System.out.println("[INST]90;None;Arrays.asList(str.split(splitString));"+Arrays.asList(str.split(splitString)));
System.out.println("[INST]90;None;str.split(splitString);"+str.split(splitString));
	}
	public static void main(String[] args){
		CONVSTR.put(8, " "); CONVSTR.put(9, "\n"); CONVSTR.put(0, "");
System.out.println("[INST]93;None;CONVSTR.put(8, ' ');"+CONVSTR.put(8, " "));
System.out.println("[INST]93;None;CONVSTR.put(9, '\n');"+CONVSTR.put(9, "\n"));
System.out.println("[INST]93;None;CONVSTR.put(0, '');"+CONVSTR.put(0, ""));
		solve();flush();
	}
	//Don't have to see. end------------------------------------------
}
