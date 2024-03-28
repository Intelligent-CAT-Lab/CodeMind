class main:
    import sys
    
    def main():
        n,a,b=map(int,sys.stdin.readline().split())
        ans=0
        ans=(n/(a+b))*a+min(a,n%(a+b))
        print(ans)
    
    if __name__ == '__main__':
        main()
    
    /p02754.py
    import sys
    
    def main():
        n,a,b=map(int,sys.stdin.readline().split())
        ans=0
        ans=(n/(a+b))*a+min(a,n%(a+b))
        print(ans)
    
    if __name__ == '__main__':
        main()