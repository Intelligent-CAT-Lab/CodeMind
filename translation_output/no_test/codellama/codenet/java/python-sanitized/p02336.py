import sys
import threading

class Combinatrics:
    def __init__(self, n):
        self.fact = [1] * (n + 1)
        self.inv = [1] *