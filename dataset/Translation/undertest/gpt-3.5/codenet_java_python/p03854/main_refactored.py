class main:
    def main():
        S = input()
        S = S.replace("eraser", "-")
        S = S.replace("erase", "-")
        S = S.replace("dreamer", "-")
        S = S.replace("dream", "-")
        S = S.replace("-", "")
        
        if len(S) == 0:
            print("YES")
        else:
            print("NO")
    
    if __name__ == "__main__":
        main()