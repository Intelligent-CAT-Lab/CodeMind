import sys

class OldState:
    def __init__(self, depth, ans):
        self.depth = depth
        self.ans = ans

class p00986:
    def main(self):
        s = sys.stdin.readline().strip()
        n = len(s)

        elements = [0]
        elementsBefore = []

        VALID_UNDO = lambda: (elements.append(elements.pop() - 1), elements.append(elementsBefore.pop()))
        INVALID_UNDO = lambda: (elements.pop(), elements.append(elementsBefore.pop()))
        OPEN = lambda: elements.pop()

        undo = []
        oldStates = []

        depth = 0
        ans = 0

        for i in range(n):
            if s[i] != '-':
                oldStates.append(OldState(depth, ans))
            if s[i] == '(':
                depth += 1
                elements.append(0)
                undo.append(OPEN)
            elif s[i] == ')':
                depth -= 1
                elementsBefore.append(elements.pop())
                if depth < 0:
                    depth = 0
                    elements.append(0)
                    undo.append(INVALID_UNDO)
                else:
                    elements.append(elements.pop() + 1)
                    undo.append(VALID_UNDO)

                delta = elements[-1]
                ans += delta
            else:
                state = oldStates.pop()
                ans = state.ans
                depth = state.depth
                undo.pop()()
            print(ans)

if __name__ == '__main__':
    p00986().main()

/src/main/java/com/leetcode/p00000/P00000.java
package com.leetcode.p00000;

import java.util.ArrayList;
import java.util.List;

public class P00000 {
    public static void main(String[] args) {
        P00000 p = new P00000();
        System.out.println(p.solveNQueens(4));
    }

    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        int[] queens = new int[n];
        dfs(0, queens, ans);
        return ans;
    }

    private void dfs(int row, int[] queens, List<List<String>> ans) {
        if (row == queens.length) {
            List<String> list = new ArrayList<>();
            for (int i = 0; i < queens.length; i++) {
                StringBuilder sb = new StringBuilder();
                for (int j = 0; j < queens.length; j++) {
                    if (j == queens[i]) {
                        sb.append('Q');
                    } else {
                        sb.append('.');
                    }
                }
                list.add(sb.toString());
            }
            ans.add(list);
            return;
        }

        for (int i = 0; i < queens.length; i++) {
            if (isValid(row, i, queens)) {
                queens[row] = i;
                dfs(row + 1, queens, ans);
            }
        }
    }

    private boolean isValid(int row, int col, int[] queens) {
        for (int i = 0; i < row; i++) {
            if (queens[i] == col) {
                return false;
            }
            if (Math.abs(row - i) == Math.abs(col - queens[i])) {
                return false;
            }
        }
        return true;
    }
}
/src/main/java/com/leetcode/p00000/P00000.py
class P00000:
    def main(self):
        print(self.solveNQueens(4))

    def solveNQueens(self, n):
        ans = []
        queens = [0] * n
        self.dfs(0, queens, ans)
        return ans

    def dfs(self, row, queens, ans):
        if row == len(queens):
            list = []
            for i in range(len(queens)):
                sb = ''
                for j in range(len(queens)):
                    if j == queens[i]:
                        sb += 'Q'
                    else:
                        sb += '.'
                list.append(sb)
            ans.append(list)
            return

        for i in range(len(queens)):
            if self.isValid(row, i, queens):
                queens[row] = i
                self.dfs(row + 1, queens, ans)

    def isValid(self, row, col, queens):
        for i in range(row):
            if queens[i] == col:
                return False
            if abs(row - i) == abs(col - queens[i]):
                return False
        return True


if __name__ == '__main__':
    P00000().main()
/src/main/java/com/leetcode/p00000/P00000.cpp
#include <iostream>
#include <vector>
#include <string>

using namespace std;

class P00000 {
public:
    vector<vector<string>> solveNQueens(int n) {
        vector<vector<string>> ans;
        vector<int> queens(n);
        dfs(0, queens, ans);
        return ans;
    }

    void dfs(int row, vector<int> &queens, vector<vector<string>> &ans) {
        if (row == queens.size()) {
            vector<string> list;
            for (int i = 0; i < queens.size(); i++) {
                string sb;
                for (int j = 0; j < queens.size(); j++) {
                    if (j == queens[i]) {
                        sb += 'Q';
                    } else {
                        sb += '.';
                    }
                }
                list.push_back(sb);
            }
            ans.push_back(list);
            return;
        }

        for (int i = 0; i < queens.size(); i++) {
            if (isValid(row, i, queens)) {
                queens[row] = i;
                dfs(row + 1, queens, ans);
            }
        }
    }

    bool isValid(int row, int col, vector<int> &queens) {
        for (int i = 0; i < row; i++) {
            if (queens[i] == col) {
                return false;
            }
            if (abs(row - i) ==