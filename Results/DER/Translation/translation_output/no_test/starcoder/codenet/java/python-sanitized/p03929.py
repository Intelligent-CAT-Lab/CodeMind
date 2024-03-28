import java.util.*; import java.io.*; import java.math.*;
public class p03929{
	static void solve(){//Here is the main function
      ArrayList<Integer> one = nextIntArray();
      int N = one.get(0);
      int d = one.get(1);
      if(N <= 2){
        myout(0);
        return;
      }
      N -= 3;
      int loop = N / 11;
      int amari = N % 11;
      int[][] map = {{1,1,1,2,2,3,4,4,5,5,5}, {0,1,2,2,3,3,3,4,4,4,5}, {1,1,1,2,2,2,3,3,4,5,5},
                    {0,0,1,1,2,3,3,4,4,4,5}, {1,2,2,3,3,3,4,4,4,5,5}, {0,0,1,1,1,2,2,3,4,4,5},
                    {0,1,1,2,3,3,4,4,4,5,5}, {1,1,2,2,2,3,3,3,4,4,5}, {0,1,1,1,2,2,3,4,4,5,5},
                    {1,1,2,3,3,4,4,4,5,5,5}, {0,1,1,1,2,2,2,3,3,4,5}};
      myout(loop * 5 + map[d][amari]);
	}
	//Method addition frame start



	//Method addition frame end

	//Don't have to see. start------------------------------------------
	static class InputIterator{
		ArrayList<String> inputLine = new ArrayList<>(1024);
		int index = 0; int max; String read;
		InputIterator(){
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			try{
				while((read = br.readLine())!= null){
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