public class 旋转数组的最小数字 {
    public static int minNumberInRotateArray(int [] array){
        if(array.length == 0){
            return 0;
        }

        if(array[0]  < array[array.length-1]){
            return array[0];
        }

        int left = 0, right = array.length - 1;

        while(left < right){
            int mid = (left + right) / 2;
            if(left - right == 1 || right - left == 1){
                return array[right];
            }
            else if(array[mid] > array[right]){
                left = mid;
            }
            else if(array[mid] < array[left]){
                right = mid;
            }
            else if(array[mid] == array[right] && array[mid] == array[left]){
                int min = -1;
                for( ; left < right; ++left){
                    if(min == -1 || min > array[left]){
                        min = array[left];
                    }
                }
                return min;
            }
        }
        return 0;
    }


    public static void main(String []args){
        int []array = {1,1,1,0,1,1};
        System.out.println(minNumberInRotateArray(array));
    }

}
