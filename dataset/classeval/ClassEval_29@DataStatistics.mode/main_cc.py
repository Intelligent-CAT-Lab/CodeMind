from collections import Counter
class DataStatistics: 
    def mode(self, data):
        counter = Counter(data)
        mode_count = max(counter.values())
        mode = [x for x, count in counter.items() if count == mode_count]
        return mode