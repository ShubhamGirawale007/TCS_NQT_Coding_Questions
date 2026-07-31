import java.util.*;
public class clone {
    static int[] countFrequency(int[] arr){
        int[] clone = arr.clone();
        int[] ans = new int[arr.length];

        for(int i =0; i < arr.length; i++){
            int count =0;
            for(int j = 0;j < clone.length;j++){
                if(arr[i] == clone[j]){
                    count +=1;
                }
            }
            ans[i] =count;
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {2,2,4,3,2,3};
        System.out.println(Arrays.toString(countFrequency(arr)));
    }

}
