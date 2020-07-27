def mazeCheck(maze,i,j):
  if(isvalid(maze,i,j)):
    if(i == len(maze)-1 and j == len(maze[0])-1):
      return True
    maze(maze,i,j+1)
    maze(maze,i+1,j)
    # maze(maze,i,j-1)
    # maze(maze,i-1,j)

def isvalid(maze,i,j):
  if(i>=0 and i < len(maze) and j>=0 and j< len(maze[0]) and maze[i][j] == 1):
    return True
  else:
    return False 


if __name__ == "__main__":
    maze = [
      [1,1,1,1,0],
      [1,0,0,1,0],
      [1,0,1,1,0],
      [1,0,1,0,0],
      [1,1,1,0,0],
      [0,0,1,1,1]
    ]
    mazeCheck(maze,0,0);