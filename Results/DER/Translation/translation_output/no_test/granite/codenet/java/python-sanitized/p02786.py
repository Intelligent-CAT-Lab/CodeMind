import math

class FastReader:
    def __init__(self):
        self.br = BufferedReader(InputStreamReader(System.in))
        self.st = StringTokenizer("")

    def nextLine(self):
        return self.br.readLine()

    def nextInt(self):
        return int(self.next())

    def nextLong(self):
        return long(self.next())

    def nextDouble(self):
        return double(self.next())

    def next(self):
        while not self.st.hasMoreElements():
            self.st = StringTokenizer(self.br.readLine())
        return self.st.nextToken()

def main():
    s = FastReader()
    h = s.nextLong()
    if h == 1:
        print(1)
    else:
        count = 1
        sum = 0
        while h > 1:
            h = h // 2
            sum += pow(2, count)
            count += 1
        print(sum + 1)

if __name__ == "__main__":
    main()