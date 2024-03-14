import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

import static java.lang.Integer.parseInt;

class p01725:
    main = None
    PRI = None

    def __init__(self):
        self.main = self
        self.PRI = [[1, 2, 3],
                    [1, 3, 2],
                    [2, 1, 3],
                    [2, 3, 1],
                    [3, 1, 2],
                    [3, 2, 1],
                    #
                    [1, 1, 2],
                    [1, 2, 1],
                    [2, 1, 1],
                    #
                    [2, 2, 1],
                    [2, 1, 2],
                    [1, 2, 2],
                    #
                    [2, 2, 2]]

    def main(self):
        br = BufferedReader(InputStreamReader(System.in))
        line = br.readLine()
        words = line.split("(?<!\\d)|(?!\\d)")
        expr = []

        for word in words:
            c = word.charAt(0)
            if c == '(':
                expr.append(self.Lp())
            elif c == ')':
                expr.append(self.Rp())
            elif c == '+':
                expr.append(self.Add())
            elif c == '-':