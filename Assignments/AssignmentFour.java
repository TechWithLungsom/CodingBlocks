public class AssignmentFour {
    public static void printArr(int arr[]) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void help(int arr[], int ans[], int indx) {
        if(indx == arr.length) {
            return;
        }

        int val = arr[indx];
        ans[val] = indx;

        help(arr, ans, indx+1);
    }
    public static void inverseArr(int arr[]) {
        int n = arr.length;
        int ans[] = new int[n];

        help(arr, ans, 0);
        printArr(ans);
    }
    public static void main(String[] args) {
        int arr[] = {0, 2, 4, 1, 3};
        printArr(arr);
        inverseArr(arr);
    }
}
