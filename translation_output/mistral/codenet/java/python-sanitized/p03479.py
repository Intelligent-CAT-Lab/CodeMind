import sys

def solve():
    x, y = map(int, input().split())
    ans = 0
    for i in range(x, y+1, 2):
        ans += 1
    print(ans)

def run():
    global INPUT
    INPUT = sys.stdin.readline().strip()
    sys.stdin.flush()
    start = time.time()
    solve()
    print(f"Time: {time.time()-start:.10f}s")

if __name__ == "__main__":
    run()