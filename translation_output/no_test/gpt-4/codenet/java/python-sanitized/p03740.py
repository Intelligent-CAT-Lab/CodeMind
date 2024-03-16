try:
    x, y = map(int, input().split())
    print("Brown" if abs(x - y) <= 1 else "Alice")
except Exception as e:
    print(e)