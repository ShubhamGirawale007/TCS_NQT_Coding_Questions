import java.util.*;
public class average {
static int avg(int[] arr){
int sum =0;
int count =0;

for(int i =0 ;i < arr.length ; i++) {
sum +=arr[i];
count +=1;
}
int average = sum /count;
return average;
}
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int[] arr = new int[n];
for(int i = 0 ; i <  n ; i++){
arr[i] = sc.nextInt();
}
System.out.print(avg(arr));
}
}
