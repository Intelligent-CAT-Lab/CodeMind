class main:
    def main():
        S = input()
        ans = "Yes"
        
        if len(S) % 2 == 1:
            ans = "No"
        else:
            i = 0
            while i < len(S)//2:
                if S[i:i+2] != "hi":
                    ans = "No"
                    break
                i += 2
                
        print(ans)
    
    if __name__ == "__main__":
        main()