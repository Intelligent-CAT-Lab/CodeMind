import sys

for line in sys.stdin:
    line = line.strip()
    strArray = list(line)
    resultNum1 = -1
    resultNum2 = -1

    for i in range(len(strArray)):
        if i + 1 <= len(strArray) - 1 and strArray[i] == strArray[i + 1]:
            resultNum1 = i + 1
            resultNum2 = i + 2
            break

        if i + 2 <= len(strArray) - 1 and strArray[i] == strArray[i + 2]:
            resultNum1 = i + 1
            resultNum2 = i + 3
            break

    print(resultNum1, resultNum2)




import java.io.IOException;
import java.util.Scanner;

public class p04032 {
    public static void main(String[] args) throws IOException {
        Scanner cin = new Scanner(System.in);
        String line;
        for (; cin.hasNext();) {
            line = cin.nextLine();

            String[] strArray = line.split("");
            int resultNum1 = -1;
            int resultNum2 = -1;

            for(int i =0; i < strArray.length; i++){

                if(i + 1 <= strArray.length - 1 && strArray[i].equals(strArray[i + 1])){
                    resultNum1 = i + 1;
                    resultNum2 = i + 2;
                    break;
                }


                if(i + 2 <= strArray.length - 1 && strArray[i].equals(strArray[i + 2])){
                    resultNum1 = i + 1;
                    resultNum2 = i + 3;
                    break;
                }
            }


            System.out.println(resultNum1 + " " + resultNum2);
        }
    }
}