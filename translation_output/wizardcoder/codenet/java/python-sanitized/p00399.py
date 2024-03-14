import java.io.BufferedReader;
import java.io.InputStreamReader;

#PCK/Prelim:   0404:   Shiba Inu
# http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=0404
class p00399:

    @staticmethod
    def main(args):
        result = 0

        with BufferedReader(InputStreamReader(System.in)) as reader:
            numDog = reader.readLine().split(" ")

            for i in range(len(numDog)):
                result += int(numDog[i])

            print(result)

if __name__ == '__main__':
    p00399.main(None)