import math
a , b , h , m = map ( int , input ( ) . split ( ) )
theta_h = 2.5 * math . pi - ( 2 * math . pi * ( ( h + ( m / 60 ) ) / 12 ) )
theta_m = 2.5 * math . pi - ( 2 * math . pi * ( m / 60 ) )
x_h = a * math . cos ( theta_h )
y_h = a * math . sin ( theta_h )
x_m = b * math . cos ( theta_m )
y_m = b * math . sin ( theta_m )
print ( ( ( x_h - x_m ) ** 2 + ( y_h - y_m ) ** 2 ) ** 0.5 )

