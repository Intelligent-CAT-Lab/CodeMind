import java.io.BufferedReader;
import java.io.InputStreamReader;

class p00399:
    def main(self):
        result = 0
        with BufferedReader(InputStreamReader(System.in)) as reader:
            numDog = reader.readLine().split()
            for i in range(len(numDog)):
                result += int(numDog[i])
            print(result)

p00399().main()