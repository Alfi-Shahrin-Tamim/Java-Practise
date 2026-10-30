    //Recursive Binary Search 
    public static int binarySearch(int[] a, int target, int left, int right){
        if(left > right) return -1;
        int mid = (right + left) / 2;
        if(a[mid] == target) return mid;
        else if(a[mid] < target) return binarySearch(a, target, mid + 1, right);
        else return binarySearch(a, target, left, mid - 1);
    }

    //Normal Binary Search without recursion
    public static int binarySearch(int[] a, int target){
        int left = 0, right = a.length - 1;
        while(left <= right){
            int mid = (right + left) / 2;
            if(a[mid] == target) return mid;
            else if(a[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }
