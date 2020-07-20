def sum(arr,n):
  if(n == len(arr)):
    return 0
  return arr[n]+sum(arr,n+1)

if __name__ == "__main__":
    print(sum([5,10,15],0))