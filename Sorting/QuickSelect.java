    public static int quickselect(int[] a, int left, int right, int k){
        if(k >= a.length){
            throw new IllegalArgumentException("K is out of range: " + k);
        }
        if(left == right){
            return a[left];
        }

        int pivotIndex = partition(a, left, right);
        if(pivotIndex == k) {
            return a[pivotIndex];
        }
        else if(pivotIndex > k){
            return quickselect(a, left, pivotIndex - 1, k);
        }
        else {
            return quickselect(a, pivotIndex + 1, right, k);
        }
    }

    public static int partition(int[] a, int left, int right){
        int pivot = a[right];
        int swap = left;

        for(int i = left; i < right; i++){
            if(a[i] < pivot){
                exchange(a, i, swap);
                swap++;
            }
        }
        exchange(a, swap, right);
        return swap;
    }
    public static void exchange(int[] a, int b, int c){
        int temp = a[b];
        a[b] = a[c];
        a[c] = temp;
    }
