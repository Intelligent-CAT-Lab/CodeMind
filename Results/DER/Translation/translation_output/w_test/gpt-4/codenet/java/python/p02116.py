Here's the translated code from Java to Python:

```python
def main():
    try:
        str_input = input()
        
        if str_input == "":
            exit(0)
        else:
            res = int(str_input)
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
    except Exception as e:
        print(e)

if __name__ == "__main__":
    main()
```

And when you run the test case with input `2`:

```python
if __name__ == "__main__":
    main()
```

The expected output should be `1`.
