package DAY7;

public class sumOfRightElement {
    public static void sum(int arr[]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sum - arr[i];
            System.out.print(arr[i] + " ");
            sum = arr[i];
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        sum(arr);
    }
}
