class main:
    def main():
        S = input()
        min_val = 1000
        for i in range(len(S) - 2):
            X = int(S[i:i+3])
            min_val = min(min_val, abs(X - 753))
        print(min_val)
    
    if __name__ == "__main__":
        main()