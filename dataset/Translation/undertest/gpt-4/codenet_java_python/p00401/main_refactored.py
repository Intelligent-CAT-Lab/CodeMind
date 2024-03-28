class main:
    def main():
        input_value = int(input())
        ans = 1
        while input_value >= ans * 2:
            ans *= 2
        print(ans)
    
    if __name__ == "__main__":
        main()