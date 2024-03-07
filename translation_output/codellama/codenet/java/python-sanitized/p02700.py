import sys

def main():
    insn = GetInput.get_array_int()
    a, b, c, d = insn[0], insn[1], insn[2], insn[3]

    t = c // b
    tt = c % b
    y = a // d
    u = a % d

    while a >= 0 or c >= 0:
        c -= b
        if c <= 0:
            print("Yes")
            return
        a -= d
        if a <= 0:
            print("No")
            return


class GetInput:
    @staticmethod
    def get_array_int():
        return list(map(int, sys.stdin.readline().split()))

    @staticmethod
    def get_int():
        return int(sys.stdin.readline())

    @staticmethod
    def get_long_input():
        return int(sys.stdin.readline())

    @staticmethod
    def get_long_array_input():
        return list(map(int, sys.stdin.readline().split()))


if __name__ == "__main__":
    main()