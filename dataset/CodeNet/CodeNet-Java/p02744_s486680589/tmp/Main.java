import java.util.*; import java.io.*; import java.math.*;
public class Main{
	static int N;
	static String[] s = "abcdefghijklmnopqrstuvwxyz".split("");
System.out.println("[INST]3;s;'abcdefghijklmnopqrstuvwxyz'.split('');"+s);
	static ArrayList<String> output = new ArrayList<>();
	static void solve(){//Here is the main function
		N = nextInt();
		dfs(new ArrayList(), 0);
		Collections.sort(output);
System.out.println("[INST]8;None;Collections.sort(output);"+Collections.sort(output));
		myout(myconv(output, 9));
	}
	//Method addition frame start

static void dfs(ArrayList<String> list, int max){
	if(list.size() == N){
System.out.println("[INST]14;None;list.size();"+list.size());
		output.add(myconv(list, 0));
		return;
	}
	for(int i = 0; i <= max; i++){
		ArrayList<String> tmp = (ArrayList<String>)list.clone();
System.out.println("[INST]19;None;list.clone();"+list.clone());
		tmp.add(s[i]);
System.out.println("[INST]20;None;tmp.add(s[i]);"+tmp.add(s[i]));
		dfs(tmp, Math.max(max, i + 1));
System.out.println("[INST]21;None;Math.max(max, i + 1);"+Math.max(max, i + 1));
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
System.out.println("[INST]34;read;br.readLine();"+read);
					inputLine.add(read);
System.out.println("[INST]35;None;inputLine.add(read);"+inputLine.add(read));
				}
			}catch(IOException e){}
			max = inputLine.size();
System.out.println("[INST]38;max;inputLine.size();"+max);
		}
		boolean hasNext(){return (index < max);}
		String next(){
			if(hasNext()){
				return inputLine.get(index++);
System.out.println("[INST]43;None;inputLine.get(index++);"+inputLine.get(index++));
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
System.out.println("[INST]63;None;input.size();"+input.size());
		for(int i = 0; i < input.size(); i++){
System.out.println("[INST]64;None;input.size();"+input.size());
			ret.add(Integer.parseInt(input.get(i)));
System.out.println("[INST]65;None;ret.add(Integer.parseInt(input.get(i)));"+ret.add(Integer.parseInt(input.get(i))));
System.out.println("[INST]65;None;Integer.parseInt(input.get(i));"+Integer.parseInt(input.get(i)));
System.out.println("[INST]65;None;input.get(i);"+input.get(i));
		}
		return ret;
	}
	static ArrayList<Long> nextLongArray(){
		ArrayList<String> input = nextStrArray(); ArrayList<Long> ret = new ArrayList<Long>(input.size());
System.out.println("[INST]70;None;input.size();"+input.size());
		for(int i = 0; i < input.size(); i++){
System.out.println("[INST]71;None;input.size();"+input.size());
			ret.add(Long.parseLong(input.get(i)));
System.out.println("[INST]72;None;ret.add(Long.parseLong(input.get(i)));"+ret.add(Long.parseLong(input.get(i))));
System.out.println("[INST]72;None;Long.parseLong(input.get(i));"+Long.parseLong(input.get(i)));
System.out.println("[INST]72;None;input.get(i);"+input.get(i));
		}
		return ret;
	}
	@SuppressWarnings("unchecked")
	static String myconv(Object list, int no){//only join
		String joinString = CONVSTR.get(no);
System.out.println("[INST]78;joinString;CONVSTR.get(no);"+joinString);
		if(list instanceof String[]){
			return String.join(joinString, (String[])list);
System.out.println("[INST]80;None;String.join(joinString, (String[])list);"+String.join(joinString, (String[])list));
		}else if(list instanceof ArrayList){
			return String.join(joinString, (ArrayList)list);
System.out.println("[INST]82;None;String.join(joinString, (ArrayList)list);"+String.join(joinString, (ArrayList)list));
		}else{
			throw new ClassCastException("Don't join");
		}
	}
	static ArrayList<String> myconv(String str, int no){//only split
		String splitString = CONVSTR.get(no);
System.out.println("[INST]88;splitString;CONVSTR.get(no);"+splitString);
		return new ArrayList<String>(Arrays.asList(str.split(splitString)));
System.out.println("[INST]89;None;Arrays.asList(str.split(splitString));"+Arrays.asList(str.split(splitString)));
System.out.println("[INST]89;None;str.split(splitString);"+str.split(splitString));
	}
	public static void main(String[] args){
		CONVSTR.put(8, " "); CONVSTR.put(9, "\n"); CONVSTR.put(0, "");
System.out.println("[INST]92;None;CONVSTR.put(8, ' ');"+CONVSTR.put(8, " "));
System.out.println("[INST]92;None;CONVSTR.put(9, '\n');"+CONVSTR.put(9, "\n"));
System.out.println("[INST]92;None;CONVSTR.put(0, '');"+CONVSTR.put(0, ""));
		solve();flush();
	}
	//Don't have to see. end------------------------------------------
}
