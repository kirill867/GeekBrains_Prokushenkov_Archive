
def my_function(*args, **kwargs):
    for arg in args:
        print(arg)
    
    #for key, value in kwargs.items():
       # print(key, value)
       #без этого будет 1 2 3 

my_function(1, 2, 3, name='John', age=25)