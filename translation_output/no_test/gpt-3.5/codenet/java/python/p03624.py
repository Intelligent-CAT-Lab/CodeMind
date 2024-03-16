```python
def main():
    string = input()
    count = [0] * 26
    alphabet = ['a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z']
    
    for char in string:
        count[ord(char) - ord('a')] += 1
    
    is_not_found = False
    for i in range(len(count)):
        if count[i] == 0:
            is_not_found = True
            break
    
    if is_not_found:
        print(alphabet[i])
    else:
        print("None")
		
if __name__ == "__main__":
    main()
```
