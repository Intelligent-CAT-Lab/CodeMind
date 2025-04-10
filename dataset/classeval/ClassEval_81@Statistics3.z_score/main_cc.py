import math
class Statistics3: 
    @staticmethod
    def z_score(data):
        mean = Statistics3.mean(data)
        std_deviation = Statistics3.standard_deviation(data)
        if std_deviation is None or std_deviation == 0:
            return None
        return [(x - mean) / std_deviation for x in data]
    @staticmethod
    def mean(data):
        if len(data) == 0:
            return None
        return sum(data) / len(data)
    @staticmethod
    def standard_deviation(data):
        n = len(data)
        if n < 2:
            return None
        mean_value = Statistics3.mean(data)
        variance = sum((x - mean_value) ** 2 for x in data) / (n - 1)
        return math.sqrt(variance)