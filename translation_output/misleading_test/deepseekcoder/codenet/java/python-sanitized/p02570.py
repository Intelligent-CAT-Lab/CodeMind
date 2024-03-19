import sys
import io

def main():
    input = io.TextIOWrapper(sys.stdin.buffer, encoding='utf-8')
    d, t, s = map(int, input.readline().split())
    ans = d / s
    if ans <= t:
        print("Yes")
    else:
        print("No")

if __name__ ==