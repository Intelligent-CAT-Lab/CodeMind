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
var newVariable_0 = inputLine.add(read);				}
			}catch(IOException e){}
			max = inputLine.size();
		}
		boolean hasNext(){return (index < max);}
		String next(){
			if(hasNext()){
var newVariable_1 = inputLine.get(index++);				return newVariable_1;
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
var newVariable_2 = input.size();		ArrayList<String> input = nextStrArray(); ArrayList<Integer> ret = new ArrayList<Integer>(newVariable_2);
var newVariable_3 = input.size();		for(int i = 0; i < newVariable_3; i++){
var newVariable_4 = ret.add(Integer.parseInt(input.get(i)));var newVariable_5 = Integer.parseInt(input.get(i));var newVariable_6 = input.get(i);			ret.add(Integer.parseInt(newVariable_6));
		}
		return ret;
	}
	static ArrayList<Long> nextLongArray(){
var newVariable_7 = input.size();		ArrayList<String> input = nextStrArray(); ArrayList<Long> ret = new ArrayList<Long>(newVariable_7);
var newVariable_8 = input.size();		for(int i = 0; i < newVariable_8; i++){
var newVariable_9 = ret.add(Long.parseLong(input.get(i)));var newVariable_10 = Long.parseLong(input.get(i));var newVariable_11 = input.get(i);			ret.add(Long.parseLong(newVariable_11));
		}
		return ret;
	}
	static String myconv(Object list, int no){//only join
		String joinString = CONVSTR.get(no);
		if(list instanceof String[]){
var newVariable_12 = String.join(joinString, (String[])list);			return newVariable_12;
		}else if(list instanceof ArrayList){
var newVariable_13 = String.join(joinString, (ArrayList)list);			return newVariable_13;
		}else{
			throw new ClassCastException("Don't join");
		}
	}
	static ArrayList<String> myconv(String str, int no){//only split
		String splitString = CONVSTR.get(no);
var newVariable_14 = Arrays.asList(str.split(splitString));var newVariable_15 = str.split(splitString);		return new ArrayList<String>(Arrays.asList(newVariable_15));
	}
	public static void main(String[] args){
var newVariable_16 = CONVSTR.put(8, " ");var newVariable_17 = CONVSTR.put(9, "\n");var newVariable_18 = CONVSTR.put(0, "");		CONVSTR.put(8, " "); CONVSTR.put(9, "\n"); newVariable_18;
		solve();flush();
	}
	//Don't have to see. end------------------------------------------
	static void solve(){//Here is the main function
      ArrayList<Long> one = nextLongArray();
      long N = one.get(0);
      long P = one.get(1);
      if(isPrime(P)){
        myout(1);
        return;
      }
      HashMap<Long, Long> pf = getPrimeFactorization(P);
      long output = 1;
var newVariable_19 = pf.keySet();      Iterator<Long> keys = newVariable_19.iterator();
      while(keys.hasNext()){
        long k = keys.next();
var newVariable_20 = pf.get(k);        if(newVariable_20 >= N){
var newVariable_21 = pf.get(k);          output *= Math.pow(k, newVariable_21 / N);
        }
      }
      myout(output);
	}
	//Method addition frame start

static HashMap<Long,Long> getPrimeFactorization(Long val){
  HashMap<Long,Long> primeList = new HashMap<Long,Long>();
  if(isPrime(val)){
var newVariable_22 = primeList.put(val, new Long("1"));          return primeList;
  }
  long div = 2;
  while(val != 1){
    if(val % div == 0){
      long count = 2;
var newVariable_23 = Math.pow(div, count);      while(val % (long)newVariable_23 == 0){
        count++;
      }
var newVariable_24 = primeList.get(div);      if(newVariable_24 == null){
var newVariable_25 = primeList.put(div, count - 1);      }else{
var newVariable_26 = primeList.put(div, primeList.get(div) + (count - 1));var newVariable_27 = primeList.get(div);        primeList.put(div, newVariable_27 + (count - 1));
      }
var newVariable_28 = Math.pow(div, count - 1);      val /= (long)newVariable_28;
      if(isPrime(val)){
var newVariable_29 = primeList.get(val);        if(newVariable_29 == null){
var newVariable_30 = primeList.put(val,(long)1);        }else{
var newVariable_31 = primeList.put(val,primeList.get(val) + 1);var newVariable_32 = primeList.get(val);          primeList.put(val,newVariable_32 + 1);
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
var newVariable_33 = Math.sqrt(val);        double root = Math.floor(newVariable_33);
        for(long i = 3; i <= root; i += 2){
                if(val % i == 0){
                        return false;
                }
        }
        return true;
}
  
	//Method addition frame end
}
