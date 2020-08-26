public class Task9 {
    static int arr[] = {10, 3024, 45, 190, 988, 1029283};

    // Method to find maximum in arr[]
    static int largest()
    {
        int i;

        // Initialize maximum element
        int max = arr[0];

        // Traverse array elements from second and
        // compare every element with current max
        for (i = 1; i < arr.length; i++)
            if (arr[i] > max)
                max = arr[i];

        return max;
    }


    public static void main(String[] args)
    {
        System.out.println("Largest in given array is " + largest());
    }

}
