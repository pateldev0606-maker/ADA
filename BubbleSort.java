package ada;
import java.util.*;

public class BubbleSort {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a[] = new int[100];
        int size, temp;

        System.out.print("Enter size of array: ");
        size = sc.nextInt();

        System.out.println("Enter elements:");
        for(int i = 0; i < size; i++){
            a[i] = sc.nextInt();
        }

        for(int i = 0; i < size - 1; i++){
            for(int j = 0; j < size - i - 1; j++){
                if(a[j] > a[j+1]){
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }

            System.out.println("After Pass " + (i+1) + ":");
            for(int k = 0; k < size; k++){
                System.out.print(a[k] + " ");
            }
            System.out.println();
        }

        System.out.println("\nSorted array:");
        for(int i = 0; i < size; i++){
            System.out.print(a[i] + " ");
        }
    }
}
