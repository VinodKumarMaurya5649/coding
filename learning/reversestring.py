def Reverse(s):
    wrd = s.split()
    new_wrd =[w[::-1] for w in wrd]
    new_s= " ".join(new_wrd)
    return new_s

getinput = input("enter any string to reverse\n")
print(Reverse(getinput))