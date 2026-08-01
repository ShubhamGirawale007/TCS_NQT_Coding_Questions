import java.util.*;
public class sumOfArray {
static int sum(int[] arr){
int sum =0;
for(int i : arr){
sum += i;
}
return sum;
}
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int[] arr = new int[n];
for(int i = 0; i < n ; i++){
arr[i] = sc.nextInt();
}
System.out.println("Sum of array is : - " + sum(arr));
}
}