public class Third {
    public static void main(String[] args) {
        int k = removeElement(new int[]{3,2,2,3}, 3);
        System.out.println(k);
    }

    public static int removeElement(int[] nums, int val) {
        int i = 0;
        int j = 0;
        while (j < nums.length) {
            while (j < nums.length && nums[j] == val) j++;
            if (j < nums.length && i != j) nums[i] = nums[j];
            i++;
            j++;
        }
        return nums.length - (j - i);
    }
}
