public class 跳台阶 {
    public static int JumpFloor(int target){
        if(target == 0 || target == 1){
            return target;
        }
        int []data = new int[target + 1];
        data[0] = 0;
        data[1] = 1;
        data[2] = 2;
        for(int i = 3; i <= target; ++i){
            data[i] = data[i-1] + data[i-2];
        }
        return data[target];
    }
}
