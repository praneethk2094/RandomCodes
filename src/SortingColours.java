import java.util.Arrays;

public class SortingColours {

    public static void sort(int[] input, int pivot) {
        int f = 0; // f point to first element
        int l = input.length - 1; // l point to last element

        while (f < l) // Until the first element is less than the last
        {
            while (f < l && input[f] <= pivot) // if element in array < or =
                // pivot increase first element.

                f++;

            while (f < l && input[l] > pivot) // if element in the array > pivot
                // decrease last element.

                l--;

            swap(input, f, l); // if both f and l are fixed at two diff elements
            // swap them

        }

    }

    public static void swap(int[] array, int i, int j) // Swapping method
    {
        int temp = array[j];
        array[j] = array[i];
        array[i] = temp;
    }

    public static void main(String[] args) {

        int[] colours = {2, 3, 4, 2, 3, 2, 4, 4, 3, 2, 3};
        System.out.println("Assuming Black=2,Pink=3,Yellow=4");
        System.out.println("Colours before sorting= " + Arrays.toString(colours));
        sort(colours, 3); // calls sort method with 3 as pivot
        sort(colours, 2); // calls sort method with 2 as pivot
        System.out.println("colours after sorting= " + Arrays.toString(colours));
    }
}
