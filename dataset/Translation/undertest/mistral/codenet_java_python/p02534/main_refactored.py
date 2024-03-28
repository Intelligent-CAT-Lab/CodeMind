class main:
    import sys
    
    def solve(K):
        answer = ""
        for i in range(K):
            answer += "ACL"
        return answer
    
    def main():
        K = int(input())
        print(solve(K))
    
    if __name__ == "__main__":
        main()