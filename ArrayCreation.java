// public class array {
//     public static void main(String[]args){
//         //int[]array1;
//         //array1=new int[5];
//         int[] array1=new int [5];
//         //array1[5]=2;
//         int len= array1.length;
//         int[] array2={1,2,3,4,5};

//     }
// }

// public class array {
//     public static void main(String[]args){
//         int[] array1=new int [5];
//         int len= array1.length;
//         for(int i=0;i<array.len;i++){
//             System.out.println("Enter a number:");
//             int val=sc.nextInt();
//             array1[i]=val;

//         }

//     }
// }

//output in array
// import java.util.Arrays;
// public class array {
//     public static void main(String[]args){
//         int[] array1=new int [5];
//         int len= array1.length;
//         for(int i=0;i<len;i++){
//             System.out.println(array1[i]);
           

//         }
//         for(int arr:array1){
//             System.out.println(arr);

//         }
//         System.out.println(array1);
//         System.out.println(Arrays.toString(array1));
//         int[] toBeSorted= {7,5,4,22,1,0};
//         Arrays.sort(toBeSorted);

//     }
// }


// import java.util.Arrays;
// import java.util.Scanner;
// public class array{
//     static String[] methodName(String[] array1){
//         return array1;
//     }
// public static void main(String[] arge)
// {
//     String[] names={"Ace","Spades"};
//     names=methodName(names);
// }}

// import java.util.Scanner;
// import java.util.Arrays;
// public class array {

//     public static void printEvenNumbers(int[] numbers) {
//         System.out.println("Even numbers in the array:");
//         for (int num : numbers) {
//             if (num % 2 == 0) {
//                 System.out.println(num);
//             }
//         }
//     }

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         int[] numbers = new int[10];

//         System.out.println("Enter 10 numbers:");

//         for (int i = 0; i < numbers.length; i++) {
//             System.out.print("Number " + (i + 1) + ": ");
//             numbers[i] = scanner.nextInt();
//         }

//         printEvenNumbers(numbers);

//         scanner.close();
//     }
// }

//twodarray
// import java.util.Scanner;
// import java.util.Arrays;
// public class array {

//     public static void printEvenNumbers(int[][]numbers) {
//         System.out.println("Even numbers in the array:");
//         for (int num : numbers) {
//             if (num % 2 == 0) {
//                 System.out.println(num);
//             }
//         }
//     }

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
        
//         int[][] twoDArray=new int[5][3];
//         int rows=twoDArray.length;
//         int columns=twoDArray[0].length;
//         for(int i=0;i<rows;i++){
//             for (int j=0;j<columns;j++){
//                 System.out.println("Enter the number: ");
//                 twoDArray[i][j]=scanner.nextInt();
//             }
//         }

//        System.out.println(Arrays.deepToString(twoDArray));
//        for(int[] row:twoDArray){
//         for (int column:row){}
//        }

//         scanner.close();
//     }
// }

// import java.util.ArrayList;
// public class array{
//     static ArrayList<Integer> myMethod(ArrayList<Integer> vals){
//         return vals;
//     }
//     public static void main(String[] args){
//         ArrayList<Integer> list=new ArrayList<>();
//         //  ArrayList<Double> list1=new ArrayList<>();
//         //   ArrayList<Bolean> list2=new ArrayList<>();
//         //    ArrayList<String> list3=new ArrayList<>();
//         //    int arrayNum={1,2,4.5};
//         //    ArrayList<Integer> arrayListFromArray=new ArrayList(Arrays.asList(arrayNum));
//         //to add element
//         list.add(1);
//         //to insert element to specified index
//         list.set(0,5);
//         //to get the element from specified index
//         int val=list.get(0);
//        //to remove element from specified index
//         list.remove(0);
//         //to get the size of ArrrayList
//         System.out.println(list.size());
//         // to check if list contains an element
//         System.out.println(list.contains(1));
//         // to check if list index of given element
//         System.out.println(list.indexOf(5));
//         //to clear the list
//         list.clear();
//         for(int element:list){

//         }
// for(int i=0;i<list.size(); i++){

// }
        
//     }
// }

// import java.util.ArrayList;
// public class array {
//     public static void main(String[] args) {
//         int[] numbers = {10, 20, 30, 40, 50};

//         int sum = 0;
//         for (int num : numbers) {
//             sum += num;
//         }

//         double average = (double) sum / numbers.length;

//         System.out.println("Average value of the array elements: " + average);
//     }
// }

// import java.util.ArrayList;
// public class array {
//     public static void main(String[] args) {
//         int[] arr = {1, 2, 3, 4, 5};
//         int target = 3;
//         boolean found = false;
        
//         for (int num : arr) {
//             if (num == target) {
//                 found = true;
//                 break;
//             }
//         }
        
//         if (found)
//             System.out.println("The array contains " + target);
//         else
//             System.out.println("The array does not contain " + target);
//     }
// }

// import java.util.ArrayList;
// public class array {
//     public static void main(String[] args) {
//         int[] arr = {12, 3, 45, 7, 19};
//         int max = arr[0];
//         int min = arr[0];
        
//         for (int i = 1; i < arr.length; i++) {
//             if (arr[i] > max) {
//                 max = arr[i];
//             }
//             if (arr[i] < min) {
//                 min = arr[i];
//             }
//         }
        
//         System.out.println("Maximum value: " + max);
//         System.out.println("Minimum value: " + min);
//     }
// }

import java.util.ArrayList;

public class ArrayCreation{
    public static ArrayList<Integer> methodName
        (ArrayList<Integer>list)
    
    {
        return list;
    }
    public static void main (String[] args){
        int[] array1=new int[3];
        ArrayList<Integer>arrayList= new ArrayList<>();
        array1[0]=5;
        System.out.print(array1[0]);
        arrayList.add(0);
        arrayList.set(0,5);
        System.out.print(arrayList.get(0));
        System.out.print(array1.length);
        System.out.print(arrayList.size());
        arrayList.remove(0);
        arrayList.add(10);
        for(int i=0;i<arrayList.size();i++){

        }
        for(int value:arrayList){

        }

    }
}

