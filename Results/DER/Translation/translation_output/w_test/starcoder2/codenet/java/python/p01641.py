

```python

```
/p01641.py
import sys

def main():
    mem = [0] * 10
    pos = 0
    sb = []
    for c in sys.stdin.readline().strip():
        idx = (ord(c) - 33) // 10
        for i in range(abs(pos - idx)):
            sb.(c) - mem[pos])
        mem[pos] = ord(c)
        sb.append('.')
    print(''.join(sb))

if __name__ == '__main__':
    main()
append('>' if idx > pos else '<')
        pos = idx
        for i in range(abs(mem[pos] - ord(c))): sb.append/p01641.cpp
#include <iostream>
#include <string>
#include <vector>

using namespace std;

int main() {
    vector<int> mem(10);
    int pos = 0;
    string s;
    getline(cin, s);
    for (char c : s) {
        int idx = (c - 33) / 10;
        for (int i = 0; i < abs(pos - idx); ++i) {
            cout << (idx < pos ? '<' : '>');
        }
        pos = idx;
        for (int i = 0; i < abs(mem[pos] - c); ++i) {
            cout << (c < mem[pos] ? '-' : '+');
        }
        mem[pos] = c;
        cout << '.';
    }
    cout << endl;
    return 0;
}

