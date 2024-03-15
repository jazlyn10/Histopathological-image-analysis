// note that binary search requires a sorted array in order to work
public class binarysearch {
    public static int search(int nums[], int target)
    {
        int start=0;
        int end= nums.length-1;
        while (start<=end)
        {
            int mid = (start + end)/2;
            if (target==nums[mid])
            {
                return mid;
            }
            else
            {
                if (target>=nums[mid])
                {
                    start=mid+1;
                }
                else
                {
                    end=mid-1;
                }
            }
        }

        return -1;
    }
    public static void main(String args[])
    {
        int nums[]={-7,1,4,10,16,78};
        int target=78;
        int result = search(nums, target);

        if (result != -1) {
            System.out.println("Target " + target + " found at index: " + result);
        } else {
            System.out.println("Target " + target + " not found in the array.");
        }
    }
}
