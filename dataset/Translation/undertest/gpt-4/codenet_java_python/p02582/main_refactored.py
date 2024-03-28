class main:
    def main():
        s = input()
    
        if s == 'RRR':
            res = 3
        elif 'RR' in s:
            res = 2
        elif 'S' in s:
            res = 1
        else:
            res = 0
    
        print(res)
    
    if __name__ == "__main__":
        main()