def n_combination3(c):
    count = c
    num = 0
    for i in range(count - 2):
        for j in range(i + 1, count - 1):
            for k in range(j + 1, count):
                num += 1

def main():
    # write your code here
    S = input()
    currentlength = 0
    length = 0
    for i in range(len(S)):
        if S[i] in ['A', 'C', 'G', 'T']:
            currentlength += 1
        else:
            if currentlength > length:
                length = currentlength
            currentlength = 0
    print(max(length, currentlength))

if __name__ == "__main__":
    main()