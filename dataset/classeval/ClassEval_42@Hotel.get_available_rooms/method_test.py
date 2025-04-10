def test(self):
        self.hotel = Hotel('Test Hotel', {'single': 3, 'double': 2, 'triple': 2})
        self.hotel.book_room('single', 3, 'guest 1')
        result = self.hotel.get_available_rooms('single')
        return result