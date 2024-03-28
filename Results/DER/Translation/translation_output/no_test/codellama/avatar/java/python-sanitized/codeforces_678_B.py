import java.sql.Timestamp
import java.util

class codeforces_678_B:
    def main(self, args):
        in = java.util.Scanner(java.lang.System.in)
        y = in.nextInt()
        leap = self.check_leap(y)
        sum = 0
        mod = 0

        for i in range(y + 1, 1000000000):
            if self.check_leap(i):
                sum += 366
            else:
                sum += 365

            if sum % 7 == 0:
                if (leap and self.check_leap(i)) or (not leap and not self.check_leap(i)):
                    print(i)
                    return
                else:
                    continue

    def check_leap(self, y):
        return y % 400 == 0 or (y % 4 == 0 and y % 100 != 0)