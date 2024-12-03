import math  
area = 0
side = list(map(int,input('Enter of side').split()))
if len(side) ==3: 
     large_side = max(side)
     if large_side>side[0] +side[1] or large_side>side[1] +side[2] or large_side>side[0] +side[2]:
         s = (side[0]+side[1]+side[2])/2
         area = math.sqrt(s*((s-side[0])*(s-side[1])*(s-side[2])))
     print(area)
elif all(side):
    printf("enter non-zero side")
else:
    printf(" enter three side")


     