def main():
    question = input().strip()
    originalQ = question[:-1].strip()
    ch = originalQ[-1]
    
    vowels = ["A", "E", "I", "O", "U", "Y"]
    b = any(v.lower() == ch.lower() for v in vowels)
    
    print("YES" if b else "NO")

if __name__ == "__main__":
    main()