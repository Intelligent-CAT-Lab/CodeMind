def main():
    count = [0] * 5
    
    for i in range(5):
        x = int(input())
        count[i] += x
        
        if count[i] == 0:
            anser = i
            
    print(anser + 1)

if __name__ == "__main__":
    main()