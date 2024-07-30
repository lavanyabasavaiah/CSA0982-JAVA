public class MissingNumberFinder {
    public static void main(String[] args) {
        int[] a = {1, 4, 5, 3, 7, 8, 6};
        int n = 8, sum = 0;
        for (int i : a) sum += i;
        System.out.println("The missing number is: " + (n * (n + 1) / 2 - sum));
    }
}
