class main:
    import math
    
    def main():
        try:
            r = int(math.sqrt(input()))
            print(r * r)
        except ValueError:
            print("Invalid input")
    
    if __name__ == "__main__":
        main()