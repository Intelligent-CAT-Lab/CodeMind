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
				throw new IndexOutOfBoundsException("