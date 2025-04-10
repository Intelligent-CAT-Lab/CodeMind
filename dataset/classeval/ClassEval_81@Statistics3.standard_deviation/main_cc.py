import math
class Statistics3: 
    @staticmethod
    def standard_deviation(data):
        n = len(data)
        if n < 2:
            return None
        mean_value = Statistics3.mean(data)
        variance = sum((x - mean_value) ** 2 for x in data) / (n - 1)
        return math.sqrt(variance)
    @staticmethod
    def mean(data):
        if len(data) == 0:
            return None
        return sum(data) / len(data)