X = int("6")
def main():
    t = 0
    curr = 0
    while curr < X:
        t += 1
        curr += t
    print(t)
if __name__ == '__main__':
    main()