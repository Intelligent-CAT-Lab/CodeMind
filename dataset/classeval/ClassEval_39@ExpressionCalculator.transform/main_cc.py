import re
from collections import deque
from decimal import Decimal
class ExpressionCalculator: 
    def __init__(self):
        """
        Initialize the expression calculator
        """
        self.postfix_stack = deque()
        self.operat_priority = [0, 3, 2, 1, -1, 1, 0, 2]

    @staticmethod
    def transform(expression):
        expression = re.sub(r"\s+", "", expression)
        expression = re.sub(r"=$", "", expression)
        arr = list(expression)

        for i, c in enumerate(arr):
            if c == '-':
                if i == 0:
                    arr[i] = '~'
                else:
                    prev_c = arr[i - 1]
                    if prev_c in {'+', '-', '*', '/', '(', 'E', 'e'}:
                        arr[i] = '~'

        if arr[0] == '~' and (len(arr) > 1 and arr[1] == '('):
            arr[0] = '-'
            return "0" + "".join(arr)
        else:
            return "".join(arr)