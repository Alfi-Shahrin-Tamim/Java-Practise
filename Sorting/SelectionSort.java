public static void selection(int[] a) {

        for(int i = 0; i < a.length -1 ; i++){
            int min = a[i];
            int idx = i;
            for(int j = i + 1; j < a.length; j++){
                if(a[j] < min){
                    min = a[j];
                    idx = j;
                }
            }
            int temp = a[i];
            a[i] = min;
            a[idx] = temp;
        }
    }
