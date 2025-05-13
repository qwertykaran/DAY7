package DAY7;

import java.util.Scanner;

public class mergeTwoSortedArray {
    public static void mergeArray(int nums1[], int nums2[]) {
        int i = 0, j = 0;
        int mergedArr[] = new int[nums1.length + nums2.length];
        int k = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                mergedArr[k] = nums1[i];
                k++;
                i++;
            } else {
                mergedArr[k] = nums2[j];
                k++;
                j++;
            }
        }
        while (i < nums1.length) {
            mergedArr[k] = nums1[i];
            k++;
            i++;
        }
        while (j < nums2.length) {
            mergedArr[k] = nums2[j];
            k++;
            j++;
        }

        for (int m = 0; m < mergedArr.length; m++) {
            System.out.print(mergedArr[m] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums1[] = new int[n];
        for (int i = 0; i < n; i++) {
            nums1[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int nums2[] = new int[m];
        for (int i = 0; i < m; i++) {
            nums2[i] = sc.nextInt();
        }
        mergeArray(nums1, nums2);
    }
}
