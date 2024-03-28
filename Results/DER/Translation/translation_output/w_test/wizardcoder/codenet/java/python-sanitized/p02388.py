import java.io.BufferedReader;
import java.io.InputStreamReader;

class p02388:

    @staticmethod
    def main(args):
        br = BufferedReader(InputStreamReader(System.in))
        num = int(br.readLine())
        print(num*num*num)

if __name__ == '__main__':
    p02388.main(None)