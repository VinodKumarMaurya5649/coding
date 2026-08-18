import pandas as pd
series = pd.Series([12,45,12,1,2,1])
print(series)

data ={
    "name" :["shiva","Suraj","Aditya"],
    "city" :["lko","blp","knp"],
    "course" : ["it","cse","aiml"],
    "marks" : [85,90,80]
}
df =pd.DataFrame(data)
# print(df)
# print(df.info())
# print(df.describe())
# df.to_csv("tefg.csv")
stu = pd.read_csv("test.csv")
print(stu)