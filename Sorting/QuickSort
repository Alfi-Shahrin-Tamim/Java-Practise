    public static void quicksort(int[] a, int left, int right){
      if(left>= right){
        return;
      }
      int partitionIndex = partition(a, left, right);

      quicksort(a, left, partitionIndex - 1);
      quicksort(a, partitionIndex + 1, right);
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
