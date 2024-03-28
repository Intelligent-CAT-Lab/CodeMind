class main:
    def gs():
        return input()
    
    def main():
        s = gs()
        print((len(s) - s.count('o'))*100 + 700)
    
    if __name__ == "__main__":
        main()