import sys

def main():
    n = int(input())
    prime = n
    mid = prime // 2
    flag = False
    
    while True:
        for i in range(2, mid+1):
            if n % i == 0:
                flag = True
                break
        
        if not flag:
            break
        else:
            flag = False
        
        n += 1
    
    print(n)

if __name__ == "__main__":
    main()