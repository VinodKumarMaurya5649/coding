import numpy as np
# a= np.array([1,2,3,4,4,5,8,2,2,2,2,3,33,3,4,6,66,5,5,5,55,99,9])
# print(a+3)
# for i in  a:
#     print(i)
# print(np.mean(a)) # it is used to find mean
# print(np.median(a)) #it is used to find median
# print(a[3:9])  # slicing possible
# all native method of python work with it like as sum,min,max etc
a2 = np.array([[[12,3],[2,3]],[[2,3],[5,6]],[[45,2],[4,6]],[[2,4],[8,9]]])
for i in a2:
    for j in i:
        for k in j:
            #print(k)
            if(k%2==0):
                print(k)
print(sum(sum(sum(a2))))
print(np.shape(a2))       