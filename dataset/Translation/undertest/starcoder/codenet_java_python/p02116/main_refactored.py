class main:
    import sys
    
    def main():
        while True:
            try:
                res = int(input())
                han = 0
                ni_beki = 1
                ruijyo = 0
                while True:
                    han = (res >> ruijyo) % 2
                    if han == 0:
                        res = (res % ni_beki) + 1
                        break
                    else:
                        ni_beki = ni_beki * 2
                        ruijyo += 1
                print(res)
            except:
                sys.exit(0)
    
    if __name__ == '__main__':
        main()