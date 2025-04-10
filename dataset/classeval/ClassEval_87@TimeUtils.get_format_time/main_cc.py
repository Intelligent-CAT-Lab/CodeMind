import datetime
import time
class TimeUtils: 
    def __init__(self):
        """
        Get the current datetime
        """
        self.datetime = datetime.datetime.now()

    def get_format_time(self, year, month, day, hour, minute, second):
        format = "%Y-%m-%d %H:%M:%S"
        time_item = datetime.datetime(year, month, day, hour, minute, second)
        return time_item.strftime(format)