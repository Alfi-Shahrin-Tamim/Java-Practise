    public static String decToBin(int n){
        if(n == 0) return "0"; 
        if(n == 1) return "1";
        String bin = decToBin(n / 2);
        return bin + n % 2;
    }
