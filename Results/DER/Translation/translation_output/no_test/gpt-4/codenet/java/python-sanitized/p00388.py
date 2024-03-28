# Design of a Mansion
def main():
    H, A, B = map(int, input().split())  # Reading multiple integers in one line
    
    ans = 0
    
    for i in range(A, B + 1):  # Python for loop range includes start but excludes end, hence B+1
        if H % i == 0:
            ans += 1
    
    print(ans)

# Entry point in Python
if __name__ == "__main__":
    main()