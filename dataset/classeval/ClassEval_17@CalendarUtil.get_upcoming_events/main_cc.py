from datetime import datetime, timedelta
class CalendarUtil: 
    def __init__(self):
        """
        Initialize the calendar with an empty list of events.
        """
        self.events = []

    def get_upcoming_events(self, num_events):
        now = datetime.now()
        upcoming_events = []
        for event in self.events:
            if event['start_time'] >= now:
                upcoming_events.append(event)
            if len(upcoming_events) == num_events:
                break
        return upcoming_events