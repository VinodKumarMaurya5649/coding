# a = { 1,2,3,4,5}
# b = frozenset(a)
# a.add(6);
# print(a)
# print(b)
# l = [ 1,4,6,45,44,5,3,4, 0]
# print(any(l))
# print(all(l))
# l = [10,20,30,40,50]
# x=enumerate(l)
# print(next(x))  # print next enumrate and deleted
# print(next(x))  #print next enumrate and deleted\
# print(list(x))  # print remaining value of enumrate
# l = [10,70,30,90,50]
# # x = enumerate(l,1)
# # x = iter(l)
# # print(next(x)) # 10
# # print(list(x)) # [20,30,40,50]
# x = reversed(l)
# y = sorted(l)
# print(list(x))
# print(y)
# d ={ 'apple': 50,"banana":30,}
# print(d.get("banana")) 
x = [1,2,3,4]; y = [23,34,56,77,67]
z = [ "e","r","t"]
print(list(zip(x,y,z))) # output = [(1, 23, 'e'), (2, 34, 'r'), (3, 56, 't')]