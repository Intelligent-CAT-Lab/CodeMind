import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int[] array = new int[3];
        int answer = 0;

        for(int i = 0; i < 3; i++){
            array[i] = Integer.parseInt(input[i]);
        }

        Arrays.sort(array);
        for(int i = 0; i < 3; i++){
            array[i] = array[2] - array[i];
        }

        if(array[0] + array[1] == 0){
            //do nothing.
        }else if(array[0] != array[1] && array[1] != array[2]){    
            if(array[0] % 2 == array[1] % 2){
                answer += (array[0] - array[1]) / 2;
                answer += array[1];
            }else if(array[0] % 2 == 0){
                answer++;
                array[0]--;
                answer += array[0]/2 + 1;
                answer += array[1]/2 + 1;
            }else if(array[1] % 2 == 0){
                answer++;
                array[1]--;
                answer += array[0]/2 + 1;
                answer += array[1]/2 + 1;    
            }    
        }else if(array[0] == array[1]){
            answer += array[0];
        }else if(array[1] == array[2]){
            answer += array[0]%2;
            answer += (array[0]+1)/2;
        }
        
        System.out.println(answer);
    }
}