    public static void mergeSort(int[] a, int start, int end){
        if(start >= end){
            return;
        }

        int mid = (start + end) / 2;
        mergeSort(a, start, mid);
        mergeSort(a, mid + 1, end);

        int[] b = Arrays.copyOfRange(a, start, mid + 1);
        int[] c = Arrays.copyOfRange(a, mid + 1, end + 1);

        int i, j, k;
        for(i = 0, j = 0, k = start; i <b.length && j < c.length;){
            if(b[i] <= c[j]) a[k++] = b[i++];
            else a[k++] = c[j++];
        }
        while (i < b.length) a[k++] = b[i++];
        while (j < c.length) a[k++] = c[j++];
    }
