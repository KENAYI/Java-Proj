
import java.util.Arrays;


class Arrayss {
    public static void main(String[] args) {
        //char vowels[] = new char[5];
        //char vowels[] = {'a', 'e', 'i', 'o', 'u'};
        char vowels[] = {'e', 'u', 'a', 'o', 'i'};
        int nums[] = {1, 2, 3, 4, 5};

        //vowels[0] = 'a';
        //vowels[1] = 'e';
        //vowels[2] = 'i';
        //vowels[3] = 'o';
        //vowels[4] = 'u';

        // update value in my 5 char array
        //vowels[2] = 'x';

        //System.out.println(java.util.Arrays.toString(vowels));

        // print out length of array
        //System.out.println(vowels.length);

        // sort values in array alphabetically
        // set range first
        //int startingIndex = 1;
        //int endingIndex = 4;

        //Arrays.sort(vowels, startingIndex, endingIndex);

        //System.out.println(Arrays.toString(vowels));


        // Find index value fo a char in array using binary search
        //Arrays.sort(vowels);

        //char key = 'o';

        //int foundItemIndex = Arrays.binarySearch(vowels, key);

        //System.out.println(Arrays.toString(vowels));
        //System.out.println(foundItemIndex);

        // fill array indices with value x

        //Arrays.fill(vowels, 'x');

        //System.out.println(Arrays.toString(vowels));

        // fill array indices with value x, within a given range

        //int startingIndex = 1;
        //int endingIndex = 4;

        //Arrays.fill(vowels, startingIndex, endingIndex, 'x');

        //System.out.println(Arrays.toString(vowels));

        // properly copy values in an array

        //int startingIndex = 1;
        //int endingIndex = 4;

        //int copyofnums[] = Arrays.copyOf(nums, nums.length);
        //int copyofnums[] = Arrays.copyOf(nums, 10);
        //int copyofnums[] = Arrays.copyOfRange(nums, startingIndex, endingIndex);

        //Arrays.fill(nums, 0);

        //System.out.println(Arrays.toString(nums));
        //System.out.println(Arrays.toString(copyofnums));

        // compare array to its copy

        int copyofnums[] = Arrays.copyOf(nums, nums.length);

        System.out.println(Arrays.equals(nums, copyofnums));
    }    
}
