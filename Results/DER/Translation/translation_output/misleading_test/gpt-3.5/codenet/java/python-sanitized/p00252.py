def p00252():
    a = list(map(int, input().split()))
    if a[0] == 1 and a[1] == 1:
        print("Open")
    elif a[2] == 1:
      print("Open")
    else:
      print("Close")

# Test case input
if __name__ == "__main__":
    p00252()