import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        System.out.println("Nhập số thập phân: ");
        int number = sc.nextInt();
        while (number != 0){
            int a = number% 2;
            stack.push(a);
            number /= 2;
        }
        int[] arr =new int[stack.size()];
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = stack.pop();
        }
        System.out.println(Arrays.toString(arr));
    }
}
