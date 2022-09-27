A = []
for x in range(0,8):
    A.append(int(input("Enter Value: ")))
print("Unsorted List: ", A)

def bubbleSort(A):
    n = len(A)
    for i in range(1, n-1):
        for j in range (n-1):
            if A[j] > A[j+1]:
                temp = A[j]
                A[j] = A[j+1]
                A[j+1] = temp
    return A

print("Sorted List: ", bubbleSort(A))
            
            
