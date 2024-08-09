import java.util.ArrayList;
// import java.util.Comparator;

class ArrayListss {
    // Create Array List and populate it with integers
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<Integer>();

        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);

        // Remove element from array list, using index
        //nums.remove(4);

        // Easily remove element from array list, using integer 
        //nums.remove(Integer.valueOf(4));

        // Clear out Array List
        //nums.clear();

        // Replace an element in array list
        //nums.set(2, Integer.valueOf(30));

        // Sort array list, ascending
        //nums.sort(Comparator.naturalOrder());

        // Sort array list, descending
        //nums.sort(Comparator.reverseOrder());

        // Print out element in given index
        //System.out.println(nums.get(2));

        // Print out number of elements in array list
        //System.out.println(nums.size());

        // Check that array list contains an ineteger, returns boolean
        //System.out.println(nums.contains(Integer.valueOf(10)));

        // Checks wether array list is empty or not, returns boolean
        //System.out.println(nums.isEmpty());

        // Apply multiplier to each number in array list using for loop, print out
        //nums.forEach(num -> {
            //System.out.println(num * 2);
        //});
        //System.out.println(nums.toString());

        // Apply multiplier to each number in array list using for loop, printing out both cases also

        System.out.println("before: " + nums.toString());

        nums.forEach(num -> {
            nums.set(nums.indexOf(num), num * 2);
        });

        System.out.println("after: " + nums.toString());
    }
}
