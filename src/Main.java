import java.util.Scanner;
/*
In this section we will see how to find to swap two number with given number :
__________________________________________________________________________________
Question : Given two integer a and b. Swap the two given variable using temporary variable.
_____________________________________________________________________________________________
Approach : first we take two integer from user, and then we will assign original value to another variable then we
           will perform execution.
___________________________________________________________________________________________________________________
 */
public class Main {
    static void sum(int a , int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println("NOW printing the value after swapping : ");
        System.out.println("a : " + a);
        System.out.println("b : " + b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE LENGTH OF ARRAY :");
        int a = sc.nextInt();
        int arr[] = new int[a];
        System.out.println("ENTER THE VALUE THAT WILL STORE IN VARIABLE :");
        for (int i =0; i < arr.length; i++){
            arr[i] = sc.nextInt();
            System.out.println("print the original value of array : " + arr[i]);
        }
        System.out.println("ENTER THE INDEX VALUE YOU WISH TO SWAP :");
        int i = sc.nextInt();
        int j = sc.nextInt();
        sum(arr[i] , arr[j]);
    }
}