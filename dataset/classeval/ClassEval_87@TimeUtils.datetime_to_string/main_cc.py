import datetime
import time
class TimeUtils: 
    def __init__(self):
        """
        Get the current datetime
        """
        self.datetime = datetime.datetime.now()

    def datetime_to_string(self, datetime):
        return datetime.strftime("%Y-%m-%d %H:%M:%S")