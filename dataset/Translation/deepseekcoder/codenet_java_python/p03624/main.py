import sys

def main():
    string = sys.stdin.readline().strip()
    count = [0]*26
    alphabet = ['a','b','c','d','e','f','g','h','i','j','k','l','m','n',
               'o','p','q','r','s','t','u','v','w','x','y','z']
    for ch in string:
        count[ord(ch)-97] += 1
    for i in range(26):
        if count[i]==0: 
            print(alphabet[i])
            return
    print("None")

if __name__ == "__main__":
    main()