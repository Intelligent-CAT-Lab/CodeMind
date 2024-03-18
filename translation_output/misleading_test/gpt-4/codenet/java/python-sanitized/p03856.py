import sys

def main():
    # Read input either from file or standard input
    try:
        with open('input.txt', 'r') as f:
            input_lines = f.readlines()
    except FileNotFoundError:
        input_lines = sys.stdin.readlines()

    for s in input_lines:
        s = s.strip()  # Remove any leading/trailing whitespace
        good = ["dream", "dreamer", "erase", "eraser"]
        poss = [False] * (len(s) + 1)
        poss[0] = True
        
        for i in range(len(s)):
            if not poss[i]:
                continue
            for out in good:
                if i + len(out) > len(s):
                    continue
                if s[i:i + len(out)] == out:
                    poss[i + len(out)] = True
        
        result = "YES" if poss[len(s)] else "NO"
        sys.stdout.write(result + '\n')

if __name__ == "__main__":
    main()