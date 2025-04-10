import unittest
import math

class DataStatistics4:

    @staticmethod
    def correlation_coefficient(data1, data2):
        n = len(data1)
        mean1 = sum(data1) / n
        mean2 = sum(data2) / n

        numerator = sum((data1[i] - mean1) * (data2[i] - mean2) for i in range(n))
        denominator = math.sqrt(sum((data1[i] - mean1) ** 2 for i in range(n))) * math.sqrt(sum((data2[i] - mean2) ** 2 for i in range(n)))

        return numerator / denominator if denominator != 0 else 0
    
    @staticmethod
    def skewness(data):
        n = len(data)
        mean = sum(data) / n
        variance = sum((x - mean) ** 2 for x in data) / n
        std_deviation = math.sqrt(variance)

        skewness = sum((x - mean) ** 3 for x in data) * n / ((n - 1) * (n - 2) * std_deviation ** 3) if std_deviation != 0 else 0

        return skewness
    
    @staticmethod
    def kurtosis(data):

        n = len(data)
        mean = sum(data) / n
        std_dev = math.sqrt(sum((x - mean) ** 2 for x in data) / n)

        if std_dev == 0:
            return math.nan

        centered_data = [(x - mean) for x in data]
        fourth_moment = sum(x ** 4 for x in centered_data) / n

        kurtosis_value = (fourth_moment / std_dev ** 4) - 3

        return kurtosis_value
    
    @staticmethod
    def pdf(data, mu, sigma):
        pdf_values = [1 / (sigma * math.sqrt(2 * math.pi)) * math.exp(-0.5 * ((x - mu) / sigma) ** 2) for x in data]
        return pdf_values
class Test(unittest.TestCase):
    def test(self):
            return DataStatistics4.correlation_coefficient([1, 2, 3], [1, 2, 4])