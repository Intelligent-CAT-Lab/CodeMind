```python
def main():
    input_values = input().split()
    left = int(input_values[0]) + int(input_values[1])
    right = int(input_values[2]) + int(input_values[3])
    if left > right:
        print('Left')
    elif left == right:
        print('Balanced')
    else:
        print('Right')

if __name__ == "__main__":
    main()
```  
