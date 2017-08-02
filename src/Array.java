
public class Array {

    public static int search(int[] input, int hit) {

        int first = 0; // Initializing first last and middle.
        int last = input.length - 1;
        int middle = (first + last) / 2;

        while (first <= last) // loop runs till first is less than or equal to
        // last
        {
            if (input[middle] == hit) // if element is hit enter loop
            {
                while (input[middle] == hit) // value of middle is reduced until
                // the element is not equal to
                // hit.
                {
                    middle--;

                }
                return middle + 1; // return index of element.
            } else if (input[middle] < hit) // if element is less than hit
            {
                first = middle + 1; // Increase the value of first to middle+1
            } else // else change the value of last
                last = middle - 1;
            middle = (first + last) / 2;
        }
        return -1; // If element is not found return -1.
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 2, 3, 3, 4}; // input array
        System.out.println(search(a, 3)); // Calls search function
    }

}
