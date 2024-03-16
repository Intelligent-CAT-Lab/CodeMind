import java.util.ArrayList
import java.util.Arrays
import java.util.StringTokenizer
import java.io

class FastReader:
    def __init__(self):
        self.br = BufferedReader(InputStreamReader(sys.stdin))
        self.st = None

    def nextLine(self):
        str = ""
        try:
            str = self.br.readLine()
        except IOError as e:
            e.printStackTrace()
        return str

    def nextInt(self):
        return int(self.next())

    def nextLong(self):
        return long(self.next())

    def nextDouble(self):
        return float(self.next())

    def next(self):
        while self.st is None or not self.st.hasMoreElements():
            try:
                self.st = StringTokenizer(self.br.readLine())
            except IOError as e:
                e.printStackTrace()
        return self.st.nextToken()


if __name__ == "__main__":
    s = FastReader()
    obj = p02786()
    sum = 0
    h = s.nextLong()
    if h == 1:
        print(1)

    else:
        count = 1
        while h > 1:
            h = h // 2
            sum += (long) (2 ** count)
            count += 1
        print(sum + 1)