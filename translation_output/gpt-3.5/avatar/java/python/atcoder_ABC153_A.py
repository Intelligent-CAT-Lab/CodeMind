```python
def main():
    monsterHP, servalATK = map(int, input().split())
    
    mod = monsterHP % servalATK
    ans = monsterHP // servalATK

    if mod > 0:
        ans += 1

    print(ans)

if __name__ == "__main__":
    main()
```
