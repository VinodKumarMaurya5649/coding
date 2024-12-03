names= []; score = {}
def get_input():
     while True:
             name =input("enter name").title()
             if name == "Done":
                 break  
             else:
                 marks = list(map(int,input('enter marks').spilt()))
                 names.append(name)
                 score[name] = marks
def main():
    for name,marks in scores.items():
        avg = avg(marks)
        grd = grade(marks)
        print(f'{name} - {grd}')
"avg"
def avg(marks):
    return sum(marks)/len(marks)
    
"GRADE"

def grade(avg):
    if(90 < marks<=100):
        grade ="A"
    elif(80<marks):
        grade = "B"
    elif(marks<80):
        grade ="Fail"
        return grade
main()
        
