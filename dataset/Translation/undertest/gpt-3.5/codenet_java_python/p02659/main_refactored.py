class main:
    def main():
        a, b = map(float, input().split())
        bb = int(b * 100 + 0.1)
        ans = int((a * bb) / 100)
        print(ans)
    
    if __name__ == "__main__":
        main()