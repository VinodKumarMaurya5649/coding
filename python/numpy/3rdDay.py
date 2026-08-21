import numpy as np
import pandas as pd
m2 = np.array([[1,2,3],[4,5,6,],[7,8,9],[3,6,8]])
print(m2)
for i in m2:
    for j in i:
        print(j)
for i in np.nditer(m2): # nditer() are used to itrate all element in multidimention  array 
    print(i , end= " ")
mt = m2.T  # .T used for transpose the matrix
mat1 = np.array([[1,2],[3,4]])
mat2 = np.array([[5,6],[7,8]])
mat3 = np.dot(mat1,mat2)

print(m2+2) 
a=3
b=3
c= np.bitwise_and(a,b)
d= np.bitwise_or(a,b)
e = np.bitwise_right_shift(a,b)
data= {
    "sub" : ["python","java","sql"],
    "marks":[40,50,90]
}
df =pd.DataFrame(data)
print(df.max())
print(df.describe())