class main:
    def main():
        X = input()
        output = ""
        for i in range(len(X)):
            if i == 4:
                output += " " + X[i]
            else:
                output += X[i]
        
        print(output)
    
    if __name__ == "__main__":
        main()