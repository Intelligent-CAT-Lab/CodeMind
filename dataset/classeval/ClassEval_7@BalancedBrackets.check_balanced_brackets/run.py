import os
import unittest
class BalancedBrackets:
    def __init__(self, expr):
        self.stack = []
        self.left_brackets = ["(", "{", "["]
        self.right_brackets = [")", "}", "]"]
        self.expr = expr

    def clear_expr(self):
        self.expr = ''.join(c for c in self.expr if (c in self.left_brackets or c in self.right_brackets))

    def check_balanced_brackets(self):
        self.clear_expr()
        for Brkt in self.expr:
            if Brkt in self.left_brackets:
                self.stack.append(Brkt)
            else:
                Current_Brkt = self.stack.pop()
                if Current_Brkt == "(":
                    if Brkt != ")":
                        return False
                if Current_Brkt == "{":
                    if Brkt != "}":
                        return False
                if Current_Brkt == "[":
                    if Brkt != "]":
                        return False
        if self.stack:
            return False
        return True
class Test(unittest.TestCase):
    def test(self):
            b = BalancedBrackets("a(b{c]]")
            return b.check_balanced_brackets()
t=Test()
a=t.test()
with open('/home/changshu/CODEMIND/dataset/classeval/ClassEval_7@BalancedBrackets.check_balanced_brackets/output.txt', 'w') as wr:
    wr.write(str(a))
        