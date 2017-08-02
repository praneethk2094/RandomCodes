public class Matrix {

    public static boolean matrixSearch(int array[][], int hit) {

        int i = 0; // i for row
        int j = array[i].length - 1; // j for column

        while (array[i][j] != hit) // run loop until hit is found
        {
            if (array[i][j] < hit && i != array.length - 1) // if array element
            // is less than hit
            // and i value is
            // less than total
            // number of rows.
            {
                i = i + 1;
            } else if (array[i][j] > hit && j > 0) // if array element is
            // greater than hit and j
            // does not point to first
            // element.
            {
                j = j - 1; // then decrease column
            } else // else break
                break;
        }

        if (array[i][j] == hit) // if the element is hit, return true.
        {
            return true;
        } else // if element is not found, return false.
            return false;

    }

    public static void main(String[] args) {

        int array[][] = {{1, 4, 7, 11, 15}, // input array
                {2, 5, 8, 12, 19}, {3, 6, 9, 16, 22}, {10, 13, 14, 17, 24}, {18, 21, 23, 26, 30}};
        System.out.println(matrixSearch(array, 20));

    }

}
