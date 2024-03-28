class main:
    import sys
    
    def main():
        input_string = sys.stdin.readline().strip()
        result = 0
        if input_string == "RRS":
            result = 2
        elif input_string == "RR":
            result = 1
        elif input_string == "SSS":
            result = 0
        else:
            result = 1
        print(result)
    
    if __name__ == "__main__":
        main()