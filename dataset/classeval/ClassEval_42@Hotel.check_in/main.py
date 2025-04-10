import unittest
class Hotel:
    def __init__(self, name, rooms):
        self.name = name
        self.available_rooms = rooms
        # available_rooms = {room_type1: room_number1, room_type2: room_number2, ...}
        # available_rooms = {'single': 5, 'double': 3}
        self.booked_rooms = {}
        # booked_rooms = {room_type1: {name1: room_number1, name2: room_number2, ...}, room_type2: {...}, ...}
        # booked_rooms = {'single': {'name1': 2, 'name2':1}, 'double': {}}

    def book_room(self, room_type, room_number, name):
        # Check if there are any rooms of the specified type available
        if room_type not in self.available_rooms.keys():
            return False

        if room_number <= self.available_rooms[room_type]:
            # Book the room by adding it to the booked_rooms dictionary
            if room_type not in self.booked_rooms.keys():
                self.booked_rooms[room_type] = {}
            self.booked_rooms[room_type][name] = room_number
            self.available_rooms[room_type] -= room_number
            return "Success!"
        elif self.available_rooms[room_type] != 0:
            return self.available_rooms[room_type]
        else:
            return False

    def check_in(self, room_type, room_number, name):
        # Check if the room of the specified type and number is booked
        if room_type not in self.booked_rooms.keys():
            return False
        if name in self.booked_rooms[room_type]:
            if room_number > self.booked_rooms[room_type][name]:
                return False
            elif room_number == self.booked_rooms[room_type][name]:
                # Check in the room by removing it from the booked_rooms dictionary
                self.booked_rooms[room_type].pop(name)
            else:
                self.booked_rooms[room_type][name] -= room_number


    def check_out(self, room_type, room_number):
        if room_type in self.available_rooms:
            self.available_rooms[room_type] += room_number
        else:
            self.available_rooms[room_type] = room_number

    def get_available_rooms(self, room_type):
        return self.available_rooms[room_type]
class Test(unittest.TestCase):
    def test(self):
            self.hotel = Hotel('Test Hotel', {'single': 3, 'double': 2})
            self.hotel.booked_rooms = {'single': {'guest 1': 2}, 'double': {'guest 2': 1}}
            return self.hotel.check_in('double', 1, 'guest 1'),self.hotel.booked_rooms