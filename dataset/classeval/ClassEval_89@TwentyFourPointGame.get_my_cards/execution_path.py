
import sys
import trace
import os
import unittest
import random


class TwentyFourPointGame:
    def __init__(self) -> None:
        self.nums = []

    def _generate_cards(self):
        for i in range(4):
            self.nums.append(random.randint(1, 9))
        assert len(self.nums) == 4

    def get_my_cards(self):
        self.nums = []
        self._generate_cards()
        return self.nums

    def answer(self, expression):
        if expression == 'pass':
            return self.get_my_cards()
        statistic = {}
        for c in expression:
            if c.isdigit() and int(c) in self.nums:
                statistic[c] = statistic.get(c, 0) + 1

        nums_used = statistic.copy()

        for num in self.nums:
            if nums_used.get(str(num), -100) != -100 and nums_used[str(num)] > 0:
                nums_used[str(num)] -= 1
            else:
                return False

        if all(count == 0 for count in nums_used.values()) == True:
            return self.evaluate_expression(expression)
        else:
            return False

    def evaluate_expression(self, expression):
        try:
            if eval(expression) == 24:
                return True
            else:
                return False
        except Exception as e:
            return False
class Test(unittest.TestCase):
    def test(self):
            game = TwentyFourPointGame()
            result = game.answer('1+1+1+1')
            return result
t=Test()
a=t.test()
with open('/home/changshu/CODEMIND/dataset/classeval/ClassEval_89@TwentyFourPointGame.get_my_cards/output.txt', 'w') as wr:
    wr.write(str(a))
        

tracer = trace.Trace(
    ignoredirs=[sys.prefix, sys.exec_prefix],
    trace=1,
    count=0)
tracer.run('t.test()')
