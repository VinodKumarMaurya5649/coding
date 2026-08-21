import matplotlib.pyplot as p
import numpy as np
x = np.array([1,2,3,5,8])
y = np.array([9,8,5,6,7])

a = np.array([1,4,3,8,5])
b = np.array([0,8,0,6,0])
c = np.array([1,6,4,0,4])
d = np.array([5,8,7,6,9])
e = np.array([1,2,3,3,8])
f = np.array([3,8,2,6,1])

p.subplot(2,2,1)
p.grid(color = "blue" ,linestyle ='dotted')
p.plot(x,y,marker ='*',linestyle='dotted', color='brown')
p.subplot(2,2,3)
p.plot(c,d,marker ='*',linestyle='dotted', color='blue')
p.subplot(2,2,4)
p.plot(e,f,marker ='*',linestyle='dotted', color='red')
p.subplot(2,2,2)
p.plot(a,b,marker ='*',linestyle='dotted', color='green')
# p.grid()
# p.plot(x,a,y,b , marker ='*',linestyle='dotted', color='red')
p.show()