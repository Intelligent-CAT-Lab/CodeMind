class main:
    import sys
    
    def main():
        str = sys.stdin.readline()
        ret = ""
        for i in range(len(str)):
            ret += str[len(str) - i - 1]
        print(ret)
    
    if __name__ == "__main__":
        main()