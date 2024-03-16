import sys

class Hayami:
    def __init__(self):
        self.hayami = []
        self.saori = 0
        self.hayami_saori = False

    def hayami_saori(self, hayami):
        return 33 <= hayami <= 126

    def saori_hayami(self):
        if self.hayami_saori:
            return self.hayami[self.saori]
        else:
            return -1

    def next_hayami(self):
        if not self.hayami_saori:
            raise NoSuchElementException
        hayamin = ""
        saori = self.saori_hayami()
        while self.hayami_saori(saori):
            hayamin += chr(saori)
            saori = self.saori_hayami()
        return hayamin

    def saorihayami(self):
        if not self.hayami_saori:
            raise NoSuchElementException
        hayami = 0
        misao = False
        saori = self.saori_hayami()
        if saori == "-":
            misao = True
            saori = self.saori_hayami()
        if saori < "0" or "9" < saori:
            raise NumberFormatException
        while True:
            if "0" <= saori and saori <= "9":
                hayami *= 10
                hayami += saori - "0"
            elif saori == -1 or not self.hayami_saori(saori):
                return misao * -hayami if misao else hayami
            else:
                raise NumberFormatException
            saori = self.saori_hayami()

    def saori_hayami(self):
        if not self.hayami_saori:
            raise NoSuchElementException
        hayami = 0
        misao = False
        saori = self.saori_hayami()
        if saori == "-":
            misao = True
            saori = self.saori_hayami()
        if saori < "0" or "9" < saori:
            raise NumberFormatException
        while True:
            if "0" <= saori and saori <= "9":
                hayami *= 10
                hayami += saori - "0"
            elif saori == -1 or not self.hayami_saori(saori):
                return misao * -hayami if misao else hayami
            else:
                raise NumberFormatException
            saori = self.saori_hayami()

    def next_double(self):
        return float(self.next_hayami())

    def close(self):
        try:
            sys.stdin.close()
        except IOError:
            pass

if __name__ == "__main__":
    hayami = Hayami()
    n = hayami.saori_hayami()
    hayami.close()
    i = 1
    while True:
        if i * n % 360 == 0:
            print(i)
            break
        i += 1


For example, in Python, we don't need to use the `static` keyword to declare class variables, and we can use the `with` statement to automatically close the input stream when we are done with it.