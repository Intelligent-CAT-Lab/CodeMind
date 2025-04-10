import datetime
import time
class TimeUtils: 
    def __init__(self):
        """
        Get the current datetime
        """
        self.datetime = datetime.datetime.now()

    def add_seconds(self, seconds):
        new_datetime = self.datetime + datetime.timedelta(seconds=seconds)
        format = "%H:%M:%S"
        return new_datetime.strftime(format)