class Main {
  public static void main(String[] args) {
    int[] arr = {1,2,3,4,5,6,7,8,9,10};

    int[] arr2 = {10,9,8,7,6,5,4,3,2,1};

    int target1 = 3;
    int target2 = 2;


    int ans = binarySearch(arr,target1);
    int ans2 = binarySearch(arr2,target2);

    System.out.println(ans);
    System.out.println(ans2);
  }

  static int binarySearch(int[] arr, int target)
  {
    int start = 0;
    int end = arr.length - 1;

    while (start <= end)
    {
      int mid = start + (end - start) / 2;

      if (orderCheck(arr) == true)
      {
        if (target == arr[mid])
        {
          return mid;
        }
        else if (target > mid)
        {
          start = mid + 1;
        }
        else if (target < mid)
        {
          end = mid - 1;
        }
      }
      else
      {
        if (target == arr[mid])
        {
          return mid;
        }
        else if (target > mid)
        {
          end = mid - 1;
        }
        else if (target < mid)
        {
          start = mid + 1;
        }
      }
    }



    return -1;
  }


  static boolean orderCheck(int[] arr)
  {
    int firstVal = arr[0];
    int lastVal = arr.length-1;

    if (firstVal <= lastVal)
    {
      return true;
    }
    else if (firstVal > lastVal)
    {
      return false;
    }

    return false;
  }
  
  }