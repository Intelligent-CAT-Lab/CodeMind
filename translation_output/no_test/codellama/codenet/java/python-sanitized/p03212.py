import sys
import queue


class p03212:
    def __init__(self):
        self.set = set()
        self.queue = queue.Queue()
        self.count = 0
        self.ch = ['3', '5', '7']
        self.queue.put("357")
        self.queue.put("375")
        self.queue.put("537")
        self.queue.put("573")
        self.queue.put("735")
        self.queue.put("753")

    def add_char(self, s, location, c):
        return s[:location] + c + s[location:]

    def main(self):
        N = int(sys.stdin.readline())
        if N < 1000:
            for s in self.queue:
                if int(s) <= N:
                    self.count += 1
            print(self.count)
            return

        while self.queue.qsize() > 0:
            s = self.queue.get()
            if int(s) <= N:
                self.count += 1
                for i in range(len(s)):
                    for c in self.ch:
                        temp = self.add_char(s, i, c)
                        if temp not in self.set:
                            self.set.add(temp)
                            self.queue.put(temp)

        print(self.count)


if __name__ == "__main__":
    p03212().main()