class main:
    def main():
        inputs = input().split()
        answer = 0
        
        for i in range(5):
            x = int(inputs[i])
            
            if x == 0:
                answer = i
                break
        
        print(answer + 1)
    
    if __name__ == "__main__":
        main()