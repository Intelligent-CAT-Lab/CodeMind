import sys

MODULO = 998244353

def prepare():
    k = int(5e5)
    invs = [0] * (k + 2)
    invs[1] = 1
    for i in range(2, k + 2):
        invs[i] = (MODULO - (MODULO // i) * invs[MODULO % i] % MODULO) % MODULO
    facts = [1] * (k + 2)
    invfacts = [1] * (k + 2)
    for i in range(1, k + 2):
        facts[i] = facts[i - 1] * i % MODULO
        invfacts[i] = invfacts[i - 1] * invs[i] % MODULO
    return facts, invfacts

facts, invfacts = prepare()

def solve(width, height):
    ph = [1] * (width + 1)
    for i in range(1, len(ph)):
        ph[i] = ph[i - 1] * (height + 1) % MODULO
    pw = [1] * (height + 1)
    for i in range(1, len(pw)):
        pw[i] = pw[i - 1] * (width + 1) % MODULO
    res = 0
    for common in range(min(height, width) + 1):
        ways = (facts[height] * invfacts[common] % MODULO * invfacts[height - common] % MODULO
                * facts[width] % MODULO * invfacts[width - common] % MODULO
                * ph[width - common] % MODULO * pw[height - common] % MODULO)
        if common % 2 == 0:
            res += ways
        else:
            res -= ways
    res %= MODULO
    if res < 0: res += MODULO
    return res

def main():
    # Using sys.stdin and sys.stdout to mimic the input and output streams
    input_stream = sys.stdin
    output_stream = sys.stdout
    width, height = map(int, input_stream.readline().split())
    res = solve(width, height)
    output_stream.write(str(res) + '\n')

# Using the `if __name__` guard to ensure the main logic
# is executed only when the script is run directly.
if __name__ == "__main__":
    main()