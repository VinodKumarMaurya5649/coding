def avg(std_marks):


    for i in range(5):


        s = s + std_marks[i]

    return s/5

def std_detail(std_name, append, std_roll_no, std_marks, std_avg):

    for i in range(int(input("enter the no. of detail you want to enter"))):

        std_name[i] = append.std_name(input("Input your name").title())

        std_roll_no[i] = int(input("enter your rollno"))

        for i in range(5):

              std_marks[i] = input("enter the marks\n")

        std_avg[i]= avg(std_marks)
    return i
jls_extract_var = std_name
i = std_detail(jls_extract_var, append, std_roll_no, std_marks, std_avg)