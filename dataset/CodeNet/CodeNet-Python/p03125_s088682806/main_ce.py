import sys
a, b = map(int, "4 12".split())
def main():
    return a + b if not b % a else b - a
if __name__ == '__main__':
    ans = main()
    print(ans)