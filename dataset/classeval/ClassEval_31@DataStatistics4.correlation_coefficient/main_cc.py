import math
class DataStatistics4: 
    def correlation_coefficient(data1, data2):
        n = len(data1)
        mean1 = sum(data1) / n
        mean2 = sum(data2) / n

        numerator = sum((data1[i] - mean1) * (data2[i] - mean2) for i in range(n))
        denominator = math.sqrt(sum((data1[i] - mean1) ** 2 for i in range(n))) * math.sqrt(sum((data2[i] - mean2) ** 2 for i in range(n)))

        return numerator / denominator if denominator != 0 else 0