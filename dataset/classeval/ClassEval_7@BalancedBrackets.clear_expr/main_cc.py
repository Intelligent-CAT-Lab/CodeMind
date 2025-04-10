
class BalancedBrackets: 
    def __init__(self, expr):
        """
        Initializes the class with an expression.
        :param expr: The expression to check for balanced brackets,str.
        """
        self.stack = []
        self.left_brackets = ["(", "{", "["]
        self.right_brackets = [")", "}", "]"]
        self.expr = expr

    def clear_expr(self):
        self.expr = ''.join(c for c in self.expr if (c in self.left_brackets or c in self.right_brackets))