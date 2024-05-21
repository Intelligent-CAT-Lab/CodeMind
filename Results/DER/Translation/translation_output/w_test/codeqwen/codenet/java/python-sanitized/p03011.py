def main():
    P, Q, R = map(int, input().split())
    max_val = 0
    if P >= Q:
        if P >= R:
            max_val = Q + R
        else:
            max_val = P + Q
    elif Q >= R:
        if Q >= P:
            max_val = P + R
        else:
            max_val = Q + R
    elif R >= P:
        if R >= Q:
            max_val = P + Q
        else:
            max_val = P + R
    print(max_val)

if __name__ == "__main__":
    main()