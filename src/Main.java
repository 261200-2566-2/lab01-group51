import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void Sort(int [] x){
        Arrays.sort(x);
        System.out.println("Result is :");
        for (int i : x) {
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = s.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            Scanner n = new Scanner(System.in);
            int num1 = n.nextInt();
            arr[i] = num1;
        }
        Sort(arr);
    }
}