    public static void hanoi(int n, char from, char to, char spare){
        if(n == 0) return;
        hanoi(n - 1, from, spare, to);
        System.out.println("Move disk " + n + " from " + from + " to " + to );
        hanoi(n - 1, spare, to, from);
    }
