class main:
    def strkn(ans):
        return " ".join(map(str, sorted(ans, reverse=True)))
    
    def main():
        input_numbers = list(map(int, input().split()))
        print(strkn(input_numbers))
    
    if __name__ == '__main__':
        main()