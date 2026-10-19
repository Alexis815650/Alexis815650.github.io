public class searchDemo {
    public static void main(String[] args) {
        int [] data = {3, 3, 7};
        int target = 3;
        int result = linearSearch(data, target);
        System.out.println("Result: " + result);
    }
    public static int linearSearch(int[] data, int target) {
        for (int i = 0; i < data.length; i++) {
            if (data[i] == target) {
                return i;
            }
        }
        return -1;
    }
}