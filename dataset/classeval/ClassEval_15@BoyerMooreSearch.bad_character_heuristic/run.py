import os
import unittest
class BoyerMooreSearch:
    def __init__(self, text, pattern):
        self.text, self.pattern = text, pattern
        self.textLen, self.patLen = len(text), len(pattern)

    def match_in_pattern(self, char):
        for i in range(self.patLen - 1, -1, -1):
            if char == self.pattern[i]:
                return i
        return -1

    def mismatch_in_text(self, currentPos):
        for i in range(self.patLen - 1, -1, -1):
            if self.pattern[i] != self.text[currentPos + i]:
                return currentPos + i
        return -1

    def bad_character_heuristic(self):
        positions = []
        for i in range(self.textLen - self.patLen + 1):
            mismatch_index = self.mismatch_in_text(i)
            if mismatch_index == -1:
                positions.append(i)
            else:
                match_index = self.match_in_pattern(self.text[mismatch_index])
                i = (mismatch_index - match_index)
        return positions
class Test(unittest.TestCase):
    def test(self):
            boyerMooreSearch = BoyerMooreSearch("ABAABA", "AB")
            return boyerMooreSearch.bad_character_heuristic()
t=Test()
a=t.test()
with open('/home/changshu/CODEMIND/dataset/classeval/ClassEval_15@BoyerMooreSearch.bad_character_heuristic/output.txt', 'w') as wr:
    wr.write(str(a))
        