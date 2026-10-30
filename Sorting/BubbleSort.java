    public static void bubbleSort(int[] a){
        boolean swap = true;
        while(swap){
            swap = false;
            for(int i = 1; i < a.length; i++){
                if(a[i] < a[i - 1]){
                    int temp = a[i];
                    a[i] = a[i-1];
                    a[i-1] = temp;
                    swap = true;
                }
            }
        }
    }
