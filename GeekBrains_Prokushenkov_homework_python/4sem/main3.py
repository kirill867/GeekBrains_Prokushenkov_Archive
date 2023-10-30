import timeit

# Импортирование функции concat_test из файла test.py
from test3 import concat_test

# Измерение времени выполнения функции concat_test
execution_time = timeit.timeit("concat_test()", globals=globals(), number=1000)

# Вывод времени выполнения
print(f"Время выполнения: секунд", execution_time) 