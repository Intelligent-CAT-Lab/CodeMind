import sys

try:
    input_str = sys.stdin.readline().strip()
    A, P = map(int, input_str.split())
    result = (P + 3*A) // 2
    print(result)
except Exception as e:
    print("Error:", e)