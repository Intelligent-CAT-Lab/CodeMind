class main:
    def main():
        s = input()
    
        print((len(s) - s.replace("o", "").__len__()) * 100 + 700)
    
    
    if __name__ == "__main__":
        main()