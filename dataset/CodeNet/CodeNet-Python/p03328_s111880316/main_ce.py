LI = lambda: list(map(int, "8 13".split()))
a, b = LI()
def main():
    f = lambda x: x * (x + 1) // 2
    ans = f(b - a - 1) - a
    print(ans)
if __name__ == "__main__":
    main()
