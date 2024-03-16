import math
import sys

debug = False

def main():
    global debug
    while True:
        inp = input().split()
        p = int(inp[0])
        m = int(inp[1])
        n = int(inp[2])
        casino = Casino(debug)
        casino.print_prob(p, m, n)
        if not debug:
            break

class Casino:
    def __init__(self, debug):
        self.debug = debug

    def print_prob(self, p, m, n):
        if p == 0:
            print(0.0)
            self.__print_bet(m)
        elif p == 50:
            if self.debug:
                print("debug\n" + str(self.__get_prob_large(p / 100.0, m, n)))
            print(float(m) / n)
            self.__print_bet(min(m, n-m))
        elif p == 100:
            print(