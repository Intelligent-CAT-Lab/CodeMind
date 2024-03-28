try:
    A, P = map(int, input().split())
    print((P + 3 * A) // 2)
except Exception as e:
    print("Exception :", e)