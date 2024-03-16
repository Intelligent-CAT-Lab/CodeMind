import sys
import threading

def solve():
    n = ni()

    ret = [[0 for _ in range(n)] for _ in range(n)]
    dfs(0, n, 1, ret)

    for i in range(n - 1):
        print(" ".join(map(str, ret[i][i + 1:n])))

def dfs(left, right, level, ret):
    if left + 1 >= right:
        return

    center = (left + right) // 2

    for i in range(left, center):
        for j in range(center, right):
            ret[i][j] = level
            ret[j][i] = level  # This line might be a typo in the original code since ret[j][j] = level would only fill the diagonal

    dfs(left, center, level + 1, ret)
    dfs(center, right, level + 1, ret)

def next_token():
    while not tokenizer or not tokenizer.remaining():
        line = sys.stdin.readline()
        if not line:
            return None
        tokenizer.append(iter(line.strip().split()))

def ni():
    return int(next_token())

def main():
    start_time = time.time()
    solve()
    sys.stdout.flush()
    print(f"{(time.time() - start_time) * 1000}ms", file=sys.stderr)

if __name__ == '__main__':
    threading.stack_size(64000000)
    thread = threading.Thread(target=main)
    thread.start()
    thread.join()

tokenizer = None