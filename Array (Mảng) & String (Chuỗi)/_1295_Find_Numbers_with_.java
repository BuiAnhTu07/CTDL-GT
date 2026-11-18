public class _1295_Find_Numbers_with_ {
    public static int findNumbers(int[] nums) {

        for (int ai : nums) {
            IO.print("aI" + ai);
        }
        return 0;
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int [] n2 = new int[4];
        n2[0] = 4;
        n2[1] = 3;
        n2[2] = 2;
        n2[3] = 1;
        for (int ai : nums) {
            IO.println("ai = " + ai)
        }
    }
}