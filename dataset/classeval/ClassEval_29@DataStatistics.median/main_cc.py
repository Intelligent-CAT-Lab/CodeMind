from collections import Counter
class DataStatistics: 
    def median(self, data):
        sorted_data = sorted(data)
        n = len(sorted_data)
        if n % 2 == 0:
            middle = n // 2
            return round((sorted_data[middle - 1] + sorted_data[middle]) / 2, 2)
        else:
            middle = n // 2
            return sorted_data[middle]