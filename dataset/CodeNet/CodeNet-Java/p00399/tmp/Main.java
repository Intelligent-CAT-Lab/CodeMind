import java.io.BufferedReader;
import java.io.InputStreamReader;

//PCK/Prelim:   0404:   Shiba Inu
// http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=0404
class Main {

	public static void main(String[] args) throws Exception {
		int result = 0;

		try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
			String[] numDog = reader.readLine().split(" ");
System.out.println("[INST]11;numDog;reader.readLine().split(' ');"+numDog);
System.out.println("[INST]11;None;reader.readLine();"+reader.readLine());

			for(int i=0;i<numDog.length;i++) {
				result += Integer.parseInt(numDog[i]);
System.out.println("[INST]14;result;Integer.parseInt(numDog[i]);"+result);
			}

			System.out.println(result);

		}
	}

}
