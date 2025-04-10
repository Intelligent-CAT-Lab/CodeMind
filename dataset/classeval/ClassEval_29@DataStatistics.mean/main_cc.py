from collections import Counter
class DataStatistics: 
    def mean(self, data):
        return round(sum(data) / len(data), 2)