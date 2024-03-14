import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;

class p00322:

    nums = [[-1, -1, -1], [-1, -1, -1], [-1, -1, -1], [-1, -1, -1]]
    used = [False] * 10

    layout = [[0, 2], [1, 1], [1, 2], [2, 0], [2, 1], [2, 2], [3, 0], [3, 1], [3, 2]]

    def main(self):
        br = BufferedReader(InputStreamReader(System.in))
        line = br.readLine()
        words = line.split(" ")

        count = 0
        for i in range(len(words)):
            n = parseInt(words[i])
            if n!= -1:
                self.used[n] = True
            else:
                count += 1
            self.nums[self.layout[i][0]][self.layout[i][1]] = n

        print(self.solve(count))

    def solve(self, c):
        if c == 0:
            if self.check():
                return 1
            else:
                return 0

        ret = 0

        for i in range(4):
            for j in range(3):
                if self.nums[i][j] == -1:
                    for k in range(1, 10):
                        if not self.used[k]:
                            self.nums[i][j] = k
                            self.used[k] = True
                            ret += self.solve(c - 1)
                            self.nums[i][j] = -1
                            self.used[k] = False
                    break

        return ret

    def check(self):
        a = [self.nums[i][0] * 100 + self.nums[i][1] * 10 + self.nums[i][2] for i in range(4)]
        return a[0] + a[1] + a[2] == a[3]

if __name__ == '__main__':
    p00322().main()