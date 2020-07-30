# def possibleCount(arr,count,i):
#   if(i >= len(arr)):
#     return 0
#   print(arr[0:i],count)
#   count += 1 
#   possibleCount(arr,count,i+1)
#   count -= 1
#   possibleCount(arr,count,i+1)

# if __name__ == "__main__":
#     arr = [5,6,8,2,6]
#     possibleCount(arr,0,0)