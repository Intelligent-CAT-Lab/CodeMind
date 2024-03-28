class main:
    import sys
    
    def gs():
        return sys.stdin.readline()
    
    def main():
        s = gs()
        print((len(s) - s.replace("o", "").count()) * 100 + 700)
    
    if __name__ == "__main__":
        main()