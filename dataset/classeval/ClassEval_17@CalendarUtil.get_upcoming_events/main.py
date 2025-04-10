import unittest
from datetime import datetime, timedelta

class CalendarUtil:
    def __init__(self):
        self.events = []

    def add_event(self, event):
        self.events.append(event)

    def remove_event(self, event):
        if event in self.events:
            self.events.remove(event)

    def get_events(self, date):
        events_on_date = []
        for event in self.events:
            if event['date'].date() == date.date():
                events_on_date.append(event)
        return events_on_date

    def is_available(self, start_time, end_time):
        for event in self.events:
            if start_time < event['end_time'] and end_time > event['start_time']:
                return False
        return True

    def get_available_slots(self, date):
        available_slots = []
        start_time = datetime(date.year, date.month, date.day, 0, 0)
        end_time = datetime(date.year, date.month, date.day, 23, 59)

        while start_time < end_time:
            slot_end_time = start_time + timedelta(minutes=60)
            if self.is_available(start_time, slot_end_time):
                available_slots.append((start_time, slot_end_time))
            start_time += timedelta(minutes=60)


        return available_slots

    def get_upcoming_events(self, num_events):
        now = datetime.now()
        upcoming_events = []
        for event in self.events:
            if event['start_time'] >= now:
                upcoming_events.append(event)
            if len(upcoming_events) == num_events:
                break
        return upcoming_events
class Test(unittest.TestCase):
    def test(self):
            calendar = CalendarUtil()
            calendar.events = [{'date': datetime(2023, 1, 1, 0, 0), 'start_time': datetime(2023, 1, 1, 1, 0),
                                'end_time': datetime(2023, 1, 1, 2, 0), 'description': 'New Year'}]
            return calendar.get_upcoming_events(1)