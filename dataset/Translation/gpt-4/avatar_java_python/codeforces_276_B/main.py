from collections import Counter

def codeforces_276_B():
    s = input()
    ar = Counter(s)
    
    cntod = sum(1 for count in ar.values() if count % 2 != 0)
    
    if cntod == 0:
        print("First")
    else:
        if cntod % 2 == 0:
            print("Second")
        else:
            print("First")

if __name__ == "__main__":
    codeforces_276_B()