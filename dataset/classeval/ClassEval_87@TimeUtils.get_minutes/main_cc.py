import datetime
import time
class TimeUtils: 
    def __init__(self):
        """
        Get the current datetime
        """
        self.datetime = datetime.datetime.now()

    def get_minutes(self, string_time1, string_time2):
        time1 = self.string_to_datetime(string_time1)
        time2 = self.string_to_datetime(string_time2)
        return round((time2 - time1).seconds / 60)
    def string_to_datetime(self, string):
        return datetime.datetime.strptime(string, "%Y-%m-%d %H:%M:%S")