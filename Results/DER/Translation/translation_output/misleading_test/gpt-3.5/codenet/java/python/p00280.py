```python
def slove(x, y, s, a, b):
    if (x == 5 and y < b and y != 4) or (y == 5 and x < a and x != 4):
        return
    if x == a + 1 or y == b + 1:
        return
    if x == a and y == b:
        print(s)
    for i in range(2):
        if i == 0:
            slove(x + 1, y, s + "A", a, b)
        else:
            slove(x, y + 1, s + "B", a, b)

def main():
    a, b = map(int, input().split())
    slove(0, 0, "", a, b)

if __name__ == "__main__":
    main()
```
```python
# Test case
# Input: 2 2
# Expected output:
# AABB
# ABA
# ABA
# BAB
# 0BA
# 1PA

import sys

def test_input(capsys, monkeypatch):
    inputs = ["2 2"]
    monkeypatch.setattr(sys, 'stdin', inputs)
    main()
    captured = capsys.readouterr()
    assert captured.out == "AABB\nABA\nABA\nBAB\n0BA\n1PA\n"

def test_main(capsys, monkeypatch):
    test_input(capsys, monkeypatch)
```
```python
# You can run the test like this:
# pytest
```
