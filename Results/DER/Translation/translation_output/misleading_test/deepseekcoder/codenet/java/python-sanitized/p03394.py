import sys

class AC_GC_22_B:
    def solve(self, testNumber, inp, out):
        n = inp.nextInt()

        if n == 3:
            out.println("2 5 63")
            return
        elif n == 4:
            out.println("2 5 20 63")
            return

        ans = []
        _2 = 0
        _3 = 0
        _23 = 0
        i = 2
        while len(ans) < n - 2:
            num = i
            if num % 2 == 0 and num % 3 == 0:
                _23 += 1
            elif num % 2 == 0:
                _2 += num
            elif num % 3 == 0:
                _3 += num

            if num % 2 == 0 or num % 3 == 0:
                ans.append(num)
            i += 1

        k = i
        sn = -1
        while True:
            num = i
            if num % 2 == 0 and (_2 % 3 == 0 or num % 3 != 0) and (_2 + num) % 3 == 0:
                sn = num
                ans.append(num)
                break
            i += 1

        i = k
        while True:
            num = i
            if num % 3 == 0 and (_3 % 2 == 0 or num % 2 != 0) and num != sn and (_3 + num) % 2 == 0:
                ans.append(num)
                break
            i += 1

        for j in range(len(ans)):
            out.print(ans[j])
            out.print(' ')


class InputReader:
    def __init__(self, stream):
        self.stream = stream

    def next