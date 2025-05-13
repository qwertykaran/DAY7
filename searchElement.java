package DAY7;

public class searchElement {
    public static int searchEle(int arr[], int element) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                return 1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int element = 5;
        System.out.println(searchEle(arr, element));
    }
}
