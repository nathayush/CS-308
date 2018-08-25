import matplotlib.pyplot as plt
import numpy as np 

x = np.arange(2**1,2**10)  
# y = eval(formula)
plt.plot(x, x)
plt.plot([2**1, 2**2, 2**3, 2**4, 2**5, 2**6, 2**7, 2**8, 2**9, 2**10], [8, 10, 17, 30, 76, 130, 226, 634, 822, 1713])
plt.ylabel("Time (microseconds)")
plt.xlabel("Input size (n)")
plt.show()
