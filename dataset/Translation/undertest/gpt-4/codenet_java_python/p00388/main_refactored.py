class main:
    # Design of a Mansion in Python
    
    def main():
        H, A, B = map(int, input().split())
        ans = 0
    
        for i in range(A, B + 1):
            if H % i == 0:
                ans += 1
    
        print(ans)
    
    if __name__ == "__main__":
        main()