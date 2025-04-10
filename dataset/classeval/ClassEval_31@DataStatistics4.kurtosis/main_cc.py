import math
class DataStatistics4: 
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