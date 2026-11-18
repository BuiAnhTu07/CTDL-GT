
public class LinearSearch {

    public int LinearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        LinearSearch ls = new LinearSearch();

        int[] arr = {12, 5, 8, 20, 7, 15};
        int target = 12;

        int result = ls.LinearSearch(arr, target);

        if (result != -1) {
            System.out.println("Tim thay so: " + target
                    + " tai vi tri: " + result);
        } else {
            System.out.println("Khong tim thay!");
        }
    }
}
