def B():
    S = "1234567876"
    minA = 1000000000000000
    for i in range(3, len(S) + 1):
        if abs(int(S[i - 3:i]) - 753) < minA:
            minA = abs(int(S[i - 3:i]) - 753)
    print(minA)
B()
