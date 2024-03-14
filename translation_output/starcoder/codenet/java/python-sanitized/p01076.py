import sys

class Task:
    def __init__(self):
        self.read = self.read_ # break the recursion

    def read_(self):
        return sys.stdin.readline().strip()

    def readInt(self):
        return int(self.read())

    def readLong(self):
        return int(self.read())

    def readFloat(self):
        return float(self.read())

    def readDouble(self):
        return float(self.read())

    def readString(self):
        return self.read()

    def readStringList(self):
        return self.read().split(' ')

    def readIntList(self):
        return list(map(int, self.readStringList()))

    def readLongList(self):
        return list(map(int, self.readStringList()))

    def readFloatList(self):
        return list(map(float, self.readStringList()))

    def readDoubleList(self):
        return list(map(float, self.readStringList()))

    def readStringMatrix(self):
        n = self.readInt()
        m = self.readInt()
        return [self.readStringList() for _ in range(n)]

    def readIntMatrix(self):
        n = self.readInt()
        m = self.readInt()
        return [self.readIntList() for _ in range(n)]

    def readLongMatrix(self):
        n = self.readInt()
        m = self.readInt()
        return [self.readLongList() for _ in range(n)]

    def readFloatMatrix(self):
        n = self.readInt()
        m = self.readInt()
        return [self.readFloatList() for _ in range(n)]

    def readDoubleMatrix(self):
        n = self.readInt()
        m = self.readInt()
        return [self.readDoubleList() for _ in range(n)]

def main():
    task = Task()
    task.read()

if __name__ == '__main__':
    main()