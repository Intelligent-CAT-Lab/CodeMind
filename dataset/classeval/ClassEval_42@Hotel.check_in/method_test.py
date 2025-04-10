def test(self):
        self.hotel = Hotel('Test Hotel', {'single': 3, 'double': 2})
        self.hotel.booked_rooms = {'single': {'guest 1': 2}, 'double': {'guest 2': 1}}

        return self.hotel.check_in('double', 1, 'guest 1'),self.hotel.booked_rooms