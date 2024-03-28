import sys

class TaskX:
    def solve(self, test_number, m, n):
        modP = 1000000007
        return self.power(m, n, modP)

    @staticmethod
    def power(a, e, modP):
        ret = 1
        while e > 0:
            if e % 2 != 0:
                ret = (ret * a) % modP
            a = (a * a) % modP
            e //= 2
        return ret


def split_tokens(input_string):
    return input_string.split()


def next_int(tokenizer):
    return int(next(tokenizer))

    
def main():
    tokenizer = split_tokens(sys.stdin.read())
    m = next_int(tokenizer)
    n = next_int(tokenizer)
    solver = TaskX()
    result = solver.solve(1, m, n)
    print(result)


if __name__ == "__main__":
    main()