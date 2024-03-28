class main:
    import sys
    
    def main():
        top = sys.stdin.readline().strip()
        score = 0
        cpp = False
        for j in range(len(top)):
            if cpp:
                if top[j] == 'g':
                    score += 1
                cpp = False
            else:
                if top[j] == 'p':
                    score -= 1
                cpp = True
        print(score)
    
    if __name__ == '__main__':
        main()