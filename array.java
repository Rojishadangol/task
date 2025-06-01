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
import java.util.Arrays;
public class array {
    public static void main(String[]args){
        int[] array1=new int [5];
        int len= array1.length;
        for(int i=0;i<len;i++){
            System.out.println(array1[i]);
           

        }
        for(int arr:array1){
            System.out.println(arr);

        }
        System.out.println(array1);
        System.out.println(Arrays.toString(array1));
        int[] toBeSorted= {7,5,4,22,1,0};
        Arrays.sort(toBeSorted);

        // for(int i=0;i<toBeSorted.length-1;i++){
        //     int min= toBeSorted[i];
        //     for (int j=i+1;j<toBeSorted.length;j++){
        //         if(toBeSorted[j]<toBeSorted[min]){
        //             min=toBeSorted[j];

        //         }
        //     }
        //     int tempVal=toBeSorted[min];
        //     toBeSorted[min]=toBeSorted[i];
        //     toBeSorted[i]=tempVal;
        // }this can be replaced by
        Arrays.sort(toBeSorted);
        int[] copiedArray=Arrays.copyOf(array1,array1.length);//copy garxac
        System.out.println(Arrays.equals(array1,copiedArray));//equal xa ki nai check garxa
        int[] newArray=new int[5];
        Arrays.fill(newArray,0);


    }
}
