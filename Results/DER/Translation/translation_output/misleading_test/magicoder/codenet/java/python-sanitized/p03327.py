import sys

class Hayami:
    def __init__(self):
        self.hayami = sys.stdin.readline().strip()
        self.index = 0

    def hayami_saori(self, hayami):
        return 33 <= hayami and hayami <= 126

    def hayamisaori(self):
        while self.index < len(self.hayami) and not self.hayami_saori(ord(self.hayami[self.index])):
            self.index += 1
        return self.index < len(self.hayami)

    def next_hayami(self):
        if not self.hayamisaori():
            raise StopIteration
        hayamin = ""
        while self.hayamisaori() and self.hayami_saori(ord(self.hayami[self.index])):
            hayamin += self.hayami[self.index]
            self.index += 1
        return hayamin

    def saori_hayami(self):
        hayami = self.next_hayami()
        try:
            return int(hayami)
        except ValueError:
            raise ValueError("Invalid integer: " + hayami)

saori = Hayami()
n = saori.saori_hayami()
if n < 1000:
    print("ABC")
else:
    print("ABD")