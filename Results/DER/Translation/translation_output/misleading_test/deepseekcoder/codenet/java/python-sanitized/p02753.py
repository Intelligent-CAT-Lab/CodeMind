import sys

class p02753:

    @staticmethod
    def main():
        S = sys.stdin.readline().strip()
        if S[0] == S[1] == S[2]:
            print("No")
        else:
            print("Yes")

    MIN = -sys.maxsize - 1
    MAX = sys.maxsize

    @staticmethod
    def read(arr, N):
        arr[:] = [int(x) for x in sys.stdin.readline().split()[:N]]

    @staticmethod
    def read_long(arr, N):
        arr[:] = [long(x) for x in sys.stdin.readline().split()[:N]]

    @staticmethod
    def read_str(arr, N):
        arr[:] = [str(x) for x in sys.stdin.readline().split()[:N]]

    @staticmethod
    def print(O):
        sys.stdout.write(str(O))

    @staticmethod
    def println(O):
        sys.stdout.write(str(O) + '\n')

    @staticmethod
    def println_arr(arr):
        sys.stdout.write(' '.join(map(str, arr)) + '\n')

    @staticmethod
    def println_arr_arr(arr):
        for row in arr:
            p02753.println_arr(row)

    @staticmethod
    def debug(O):
        sys.stderr.write(str(O) + '\n')


if __name__ == "__main__":
    p02753.main()