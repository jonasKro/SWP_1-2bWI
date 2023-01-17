package Structured_programming;

public class Array_1 {
    public static void main(String[] args) {
        int array[] = {1,2,3,4,5,6,7,8,9,10};
        int sum = 0;
        for (int i=0;i<=9;i++){
            sum += array[i];
            System.out.println(sum);
        }
    }
}
