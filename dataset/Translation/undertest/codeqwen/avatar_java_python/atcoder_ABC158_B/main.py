class atcoder_ABC158_B:
    def run(self):
        N = int(input())
        A = int(input())
        B = int(input())
        base = N // (A + B)
        mod = N % (A + B)
        if mod >= A:
            mod = A
        print(base * A + mod)
        return

if __name__ == "__main__":
    solver = atcoder_ABC158_B()
    solver.run()