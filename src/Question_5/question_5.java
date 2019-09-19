package Question_5;
import java.util.*;

public class question_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Enter the size of array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(90);
        }
        System.out.println("Random array: ");
        for(int i=0; i<size; i++){
            System.out.print(array[i] + "\t");
        }
        System.out.println();
        insertionsort(array);
        System.out.println("Sorted array: ");
        for(int i=0; i<size; i++){
            System.out.print(array[i] + "\t");
        }
    }
    public static int[] insertionsort(int[] num) {
        for (int i = 0; i < num.length; i++) {
            int numi = num[i];
            int j = i;
            while ((j > 0) && (numi < num[j-1])) {
                num[j] = num[j-1];
                j--;
            }
            num[j] = numi;
        }
        return num;
    }
}
