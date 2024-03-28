class main:
    def solve(k):
        return "ACL" * k
    
    def show(answer):
        print(answer)
    
    def main():
        k = int(input())
        answer = solve(k)
        show(answer)
    
    if __name__ == "__main__":
        main()