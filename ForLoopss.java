class ForLoopss {
    public static void main(String[] args) {
        // Simply print out values in array
        
        //for (int num = 1; num <= 10; num++) {
            //System.out.println(num);

        //int nums[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        
        //for (int index = 0; index < nums.length; index++) {
            //System.out.println(nums[index]);

        // Find sum of values in array
        
        //int sum = 0;

        //for (int index = 0; index < nums.length; index++) {
            //sum += nums[index];
        

        //System.out.println(sum);

        // Multiply a number by given multiplier which increases by 1, within range of 10 

        //int num = 5;

        //for(int multiplier = 1; multiplier < 10; multiplier++) {
            //System.out.printf("%d x %d = %d \n", num, multiplier, num * multiplier);
        
        // Implement nested for loop to multiply numbers within the range of 10 by a multiplier within the same range

        //for (int num = 1; num <= 10; num++) {
            //for (int multiplier = 1; multiplier <= 10; multiplier++) {
                //System.out.printf("%d x %d = %d \n", num, multiplier, num * multiplier);
            //}
        //}

        // Print out odd values between 0 and 50

        //for (int num = 1; num <= 50; num++) {
            //if (num % 2 == 1) {
                //System.out.println(num);
            //}
        //}

        // Print out each element in array using for loop

        int nums[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        //for (int num : nums) {
            //System.out.println(num);
        //}

        // Print out sum of elements in array using for loop

        int sum = 0;

        for (int num : nums) {
            sum += num;
        }

        System.out.println(sum);
    }    
}
