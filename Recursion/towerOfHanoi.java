    public static void towerOfHanoi(int n, char from, char to, char spare){
        if(n == 0) return;
        towerOfHanoi(n - 1, from, spare, to);
        System.out.println("Move disc " + n + " from " + from + " to " + to);
        towerOfHanoi(n - 1, spare, to, from);
    }
