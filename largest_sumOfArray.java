//import java.util.Scanner;
//public class largest_sumOfArray {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter the size of the array : ");
//        int n = sc.nextInt();
//        int arr[] = new int[n];
//        for (int i = 0; i < n; i++) {
//            System.out.println("enter the element : ");
//            arr[i] = sc.nextInt();
//        }
//        printArray(arr);
//        System.out.println("sum : "+sumOfElements(arr));
//        System.out.println("largest : "+largestElementInArray(arr));
//    }
//
//    public static void printArray(int arr[]) {
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println();
//    }
//    public static int sumOfElements(int arr[]) {
//        int sum = 0;
//        for (int i = 0; i < arr.length; i++) {
//            sum = sum + arr[i];
//        }
//        return sum;
//    }
//    public static int largestElementInArray(int arr[]) {
//        int largest = arr[0];
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] > largest)
//                largest = arr[i];
//        }
//        return largest;
//    }
//}
