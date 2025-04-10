import math
class Statistics3: 
    @staticmethod
    def mean(data):
        if len(data) == 0:
            return None
        return sum(data) / len(data)