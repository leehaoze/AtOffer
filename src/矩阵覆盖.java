public class 矩阵覆盖 {
    public static int RectCover(int target) {
        int []data = new int[target+1];
        if(target == 0 || target == 1){
            return target;
        }
        data[0] = 1;
        data[1] = 1;
        for(int i = 2; i <= target; ++i){
            data[i] = data[i-1] + data[i-2];
        }
        return data[target];
    }

    public static void main(String args[]){
        System.out.println(RectCover(0));
        System.out.println(RectCover(1));
        System.out.println(RectCover(2));
        System.out.println(RectCover(3));
        System.out.println(RectCover(4));
        System.out.println(RectCover(5));
        System.out.println(RectCover(10));
        System.out.println(RectCover(20));
        System.out.println(RectCover(20));
    }
}
