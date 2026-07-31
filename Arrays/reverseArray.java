import java.util.*;
public class reverseArray{
static int[] reverse(int[] arr){
int start = 0;
int end = arr.length-1;
while(start <  end){
int temp = arr[start];
arr[start] = arr[end];
arr[end] = temp;
start++;
end--;
}
return arr;
}
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int n=sc.nextInt();
int[] arr = new int[n];
for(int i = 0; i < n; i++){
arr[i] = sc.nextInt();
}

System.out.println(Arrays.toString(reverse(arr)));

}  
}


