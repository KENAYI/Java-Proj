class WhileLoopss {
    public static void main(String[] args) {
        // Print out multipliers table for given number
        int num = 5;
        int multiplier = 1;

        while (multiplier <= 10) {
            System.out.printf("%d x %d = %d \n", num, multiplier, num * multiplier);

            multiplier++;
        }
    }    
}
