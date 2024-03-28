class main:
    import sys
    
    def main():
        line = input()
        length = len(line)
        print(line[:length-8])
    
    if __name__ == "__main__":
        main()