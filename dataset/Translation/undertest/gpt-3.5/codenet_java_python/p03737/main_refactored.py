class main:
    def main():
        words = input().split()
        result = ''.join(word[0].upper() for word in words[:3])
        print(result)
    
    if __name__ == "__main__":
        main()