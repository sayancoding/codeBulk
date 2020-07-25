def subSet(arr,result,n):
  if(n >= len(arr)):
    return
  result += str(arr[n])
  print(result)
  subSet(arr,result,n+1)
  subSet(arr,result,n+2)

if __name__ == "__main__":
  arr = [1,2,3] 
  for i in range (len(arr)):
    subSet(arr," ",i)