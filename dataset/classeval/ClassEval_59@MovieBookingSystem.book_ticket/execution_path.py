
import sys
import trace
import os
import unittest
from datetime import datetime
import numpy as np

class MovieBookingSystem:
    def __init__(self):
        self.movies = []

    def add_movie(self, name, price, start_time, end_time, n):
        movie = {
            'name': name,
            'price': price,
            'start_time': datetime.strptime(start_time, '%H:%M'),
            'end_time': datetime.strptime(end_time, '%H:%M'),
            'seats': np.zeros((n, n))
        }
        self.movies.append(movie)

    def book_ticket(self, name, seats_to_book):
        for movie in self.movies:
            if movie['name'] == name:
                for seat in seats_to_book:
                    if movie['seats'][seat[0]][seat[1]] == 0:
                        movie['seats'][seat[0]][seat[1]] = 1
                    else:
                        return "Booking failed."
                return "Booking success."
        return "Movie not found."


    def available_movies(self, start_time, end_time):
        start_time = datetime.strptime(start_time, '%H:%M')
        end_time = datetime.strptime(end_time, '%H:%M')

        available_movies = []
        for movie in self.movies:
            if start_time <= movie['start_time'] and movie['end_time'] <= end_time:
                available_movies.append(movie['name'])

        return available_movies
class Test(unittest.TestCase):
    def test(self):
            self.system = MovieBookingSystem()
            self.system.add_movie('Batman', 49.9, '17:05', '19:25', 3)
            self.system.book_ticket('Batman', [(0, 0)])
            result = self.system.book_ticket('Batman', [(0, 0)])
            return result,self.system.movies[0]['seats'][0][0]
t=Test()
a=t.test()
with open('/home/changshu/CODEMIND/dataset/classeval/ClassEval_59@MovieBookingSystem.book_ticket/output.txt', 'w') as wr:
    wr.write(str(a))
        

tracer = trace.Trace(
    ignoredirs=[sys.prefix, sys.exec_prefix],
    trace=1,
    count=0)
tracer.run('t.test()')
