```python
import math

MOD = 1000000007

class FastIO:
    def __init__(self):
        self.inp = open(0, 'r')
        self.out = open(1, 'w')
        self.err = open(2, 'w')

    def next_int(self):
        return int(self.inp.readline())

    def next_line(self):
        return self.inp.readline().strip()

    def print(self, *args, sep=' ', end='\n'):
        self.out.write(sep.join(map(str, args)))
        self.out.write(end)

    def close(self):
        self.inp.close()
        self.out.close()
        self.err.close()

class Range:
    def __init__(self, lower, upper, lower_type, upper_type):
        self.lower = lower
        self.upper = upper
        self.lower_type = lower_type
        self.upper_type = upper_type

    @staticmethod
    def range(lower, lower_type, upper, upper_type):
        if lower is not None and upper is not None:
            comp = lower.compare(upper)
            if comp > 0:
                raise ValueError("Invalid range")
            elif comp == 0:
                if lower_type == BoundType.OPEN and upper_type == BoundType.OPEN:
                    raise ValueError("Invalid range")
                elif lower_type == BoundType.OPEN or upper_type == BoundType.OPEN:
                    return Range(None, BoundType.CLOSED, None, BoundType.CLOSED)
        return Range(lower, upper, lower_type, upper_type)

    @staticmethod
    def all():
        return Range(None, BoundType.OPEN, None, BoundType.OPEN)

    @staticmethod
    def at_most(upper):
        return Range(None, BoundType.OPEN, upper, BoundType.CLOSED)

    @staticmethod
    def less_than(upper
