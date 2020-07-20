def reverse(arr,i,j):
  if(i <= j):
    temp = arr[i]
    arr[i] = arr[j]
    arr[j] = temp
    reverse(arr,i+1,j-1)
  return arr

if __name__ == "__main__":
  print(reverse([1,2,3,4],0,3))