def box_find(get_fruit):
    if(get_fruit == 0):
        return 0
    else:
       a = get_fruit//10
       b = get_fruit%10
       if(b>0):
          return a+1
       else:
        return a
# input
get_fruit = int(input("enter the total no. apple"))
box = box_find(get_fruit);
print(box)


