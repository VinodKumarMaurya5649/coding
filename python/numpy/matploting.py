import matplotlib.pyplot as p
import numpy as np
x = np.array([1,2,3,5,8])
y = np.array([9,8,5,6,7])

a = np.array([1,0,3,0,8])
b = np.array([0,8,0,6,0])
p.subplot(1,2,1)
p.plot(x,y)
p.subplot(1,2,2)
p.plot(a,b)
# p.grid()
# p.plot(x,a,y,b , marker ='*',linestyle='dotted', color='red')
p.show()