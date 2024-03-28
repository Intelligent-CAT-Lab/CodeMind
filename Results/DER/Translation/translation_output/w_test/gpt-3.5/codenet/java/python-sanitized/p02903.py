def main():
    h, w, a, b = map(int, input().split())
    s1 = "0" * a + "1" * (w - a)
    s2 = "1" * a + "0" * (w - a)
    
    for i in range(h):
        if i < b:
            print(s1)
        else:
            print(s2)

if __name__ == "__main__":
    main()