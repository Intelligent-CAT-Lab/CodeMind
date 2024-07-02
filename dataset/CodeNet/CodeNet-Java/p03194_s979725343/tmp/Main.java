import java.util.*; import java.io.*; import java.math.*;
public class Main{
	//Don't have to see. start------------------------------------------
	static class InputIterator{
		ArrayList<String> inputLine = new ArrayList<String>(1024);
		int index = 0; int max; String read;
		InputIterator(){
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			try{
				while((read = br.readLine()) != null){
System.out.println("[INST]9;read;br.readLine();"+read);
					inputLine.add(read);
System.out.println("[INST]10;None;inputLine.add(read);"+inputLine.add(read));
				}
			}catch(IOException e){}
			max = inputLine.size();
System.out.println("[INST]13;max;inputLine.size();"+max);
		}
		boolean hasNext(){return (index < max);}
		String next(){
			if(hasNext()){
				return inputLine.get(index++);
System.out.println("[INST]18;None;inputLine.get(index++);"+inputLine.get(index++));
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
System.out.println("[INST]38;None;input.size();"+input.size());
		for(int i = 0; i < input.size(); i++){
System.out.println("[INST]39;None;input.size();"+input.size());
			ret.add(Integer.parseInt(input.get(i)));
System.out.println("[INST]40;None;ret.add(Integer.parseInt(input.get(i)));"+ret.add(Integer.parseInt(input.get(i))));
System.out.println("[INST]40;None;Integer.parseInt(input.get(i));"+Integer.parseInt(input.get(i)));
System.out.println("[INST]40;None;input.get(i);"+input.get(i));
		}
		return ret;
	}
	static ArrayList<Long> nextLongArray(){
		ArrayList<String> input = nextStrArray(); ArrayList<Long> ret = new ArrayList<Long>(input.size());
System.out.println("[INST]45;None;input.size();"+input.size());
		for(int i = 0; i < input.size(); i++){
System.out.println("[INST]46;None;input.size();"+input.size());
			ret.add(Long.parseLong(input.get(i)));
System.out.println("[INST]47;None;ret.add(Long.parseLong(input.get(i)));"+ret.add(Long.parseLong(input.get(i))));
System.out.println("[INST]47;None;Long.parseLong(input.get(i));"+Long.parseLong(input.get(i)));
System.out.println("[INST]47;None;input.get(i);"+input.get(i));
		}
		return ret;
	}
	static String myconv(Object list, int no){//only join
		String joinString = CONVSTR.get(no);
System.out.println("[INST]52;joinString;CONVSTR.get(no);"+joinString);
		if(list instanceof String[]){
			return String.join(joinString, (String[])list);
System.out.println("[INST]54;None;String.join(joinString, (String[])list);"+String.join(joinString, (String[])list));
		}else if(list instanceof ArrayList){
			return String.join(joinString, (ArrayList)list);
System.out.println("[INST]56;None;String.join(joinString, (ArrayList)list);"+String.join(joinString, (ArrayList)list));
		}else{
			throw new ClassCastException("Don't join");
		}
	}
	static ArrayList<String> myconv(String str, int no){//only split
		String splitString = CONVSTR.get(no);
System.out.println("[INST]62;splitString;CONVSTR.get(no);"+splitString);
		return new ArrayList<String>(Arrays.asList(str.split(splitString)));
System.out.println("[INST]63;None;Arrays.asList(str.split(splitString));"+Arrays.asList(str.split(splitString)));
System.out.println("[INST]63;None;str.split(splitString);"+str.split(splitString));
	}
	public static void main(String[] args){
		CONVSTR.put(8, " "); CONVSTR.put(9, "\n"); CONVSTR.put(0, "");
System.out.println("[INST]66;None;CONVSTR.put(8, ' ');"+CONVSTR.put(8, " "));
System.out.println("[INST]66;None;CONVSTR.put(9, '\n');"+CONVSTR.put(9, "\n"));
System.out.println("[INST]66;None;CONVSTR.put(0, '');"+CONVSTR.put(0, ""));
		solve();flush();
	}
	//Don't have to see. end------------------------------------------
	static void solve(){//Here is the main function
      ArrayList<Long> one = nextLongArray();
      long N = one.get(0);
System.out.println("[INST]72;N;one.get(0);"+N);
      long P = one.get(1);
System.out.println("[INST]73;P;one.get(1);"+P);
      if(isPrime(P)){
        myout(1);
        return;
      }
      HashMap<Long, Long> pf = getPrimeFactorization(P);
      long output = 1;
      Iterator<Long> keys = pf.keySet().iterator();
System.out.println("[INST]80;keys;pf.keySet().iterator();"+keys);
System.out.println("[INST]80;None;pf.keySet();"+pf.keySet());
      while(keys.hasNext()){
        long k = keys.next();
        if(pf.get(k) >= N){
System.out.println("[INST]83;None;pf.get(k);"+pf.get(k));
          output *= Math.pow(k, pf.get(k) / N);
System.out.println("[INST]84;output;Math.pow(k, pf.get(k) / N);"+output);
System.out.println("[INST]84;None;pf.get(k);"+pf.get(k));
        }
      }
      myout(output);
	}
	//Method addition frame start

static HashMap<Long,Long> getPrimeFactorization(Long val){
  HashMap<Long,Long> primeList = new HashMap<Long,Long>();
  if(isPrime(val)){
          primeList.put(val, new Long("1"));
System.out.println("[INST]94;None;primeList.put(val, new Long('1'));"+primeList.put(val, new Long("1")));
          return primeList;
  }
  long div = 2;
  while(val != 1){
    if(val % div == 0){
      long count = 2;
      while(val % (long)Math.pow(div, count) == 0){
System.out.println("[INST]101;None;Math.pow(div, count);"+Math.pow(div, count));
        count++;
      }
      if(primeList.get(div) == null){
System.out.println("[INST]104;None;primeList.get(div);"+primeList.get(div));
        primeList.put(div, count - 1);
System.out.println("[INST]105;None;primeList.put(div, count - 1);"+primeList.put(div, count - 1));
      }else{
        primeList.put(div, primeList.get(div) + (count - 1));
System.out.println("[INST]107;None;primeList.put(div, primeList.get(div) + (count - 1));"+primeList.put(div, primeList.get(div) + (count - 1)));
System.out.println("[INST]107;None;primeList.get(div);"+primeList.get(div));
      }
      val /= (long)Math.pow(div, count - 1);
System.out.println("[INST]109;None;Math.pow(div, count - 1);"+Math.pow(div, count - 1));
      if(isPrime(val)){
        if(primeList.get(val) == null){
System.out.println("[INST]111;None;primeList.get(val);"+primeList.get(val));
          primeList.put(val,(long)1);
System.out.println("[INST]112;None;primeList.put(val,(long)1);"+primeList.put(val,(long)1));
        }else{
          primeList.put(val,primeList.get(val) + 1);
System.out.println("[INST]114;None;primeList.put(val,primeList.get(val) + 1);"+primeList.put(val,primeList.get(val) + 1));
System.out.println("[INST]114;None;primeList.get(val);"+primeList.get(val));
        }
        break;
      }
    }else{
      div = (div == 2) ? div + 1 : div + 2;
    }
  }
  return primeList;
}
  
static boolean isPrime(long val){
        if(val <= 1 || (val != 2 && val % 2 == 0)){
                return false;
        }else if(val == 2){
                return true;
        }
        double root = Math.floor(Math.sqrt(val));
System.out.println("[INST]131;root;Math.floor(Math.sqrt(val));"+root);
System.out.println("[INST]131;None;Math.sqrt(val);"+Math.sqrt(val));
        for(long i = 3; i <= root; i += 2){
                if(val % i == 0){
                        return false;
                }
        }
        return true;
}
  
	//Method addition frame end
}
