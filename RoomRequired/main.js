givenTimeSlot = [[30,75],[0,50],[60,150],[145,180],[25,35]];
startTime = []
endTime = []
ln  = givenTimeSlot.length;

function result (arr)
{   
    for(i=0;i<arr.length;i++)
    {
        startTime.push(arr[i][0])
        endTime.push(arr[i][1]);
    }
    startTime.sort((a, b) => a - b)
    endTime.sort((a, b) => a - b)
    roomBuild(startTime,endTime,ln);
}

function roomBuild(startTime,endTime,n)
{
    room = 0;
    startPointer = 0;
    endPointer = 0;
    while(startPointer<n)
    {
        if(startTime[startPointer++]>=endTime[endPointer])
            ++endPointer;
        else
            ++room;
    }
    console.log(room)
}

result(givenTimeSlot)