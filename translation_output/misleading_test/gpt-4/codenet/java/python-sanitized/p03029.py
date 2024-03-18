# Python equivalent code
try:
    # Taking input from the user and splitting the input on space
    A, P = map(int, input().split())
    # Calculating and printing the result
    print((P + 3 * A) // 2)
except Exception as e:
    print("Exception:", e)