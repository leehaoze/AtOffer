public class 变态跳台阶 {
    public static int JumpFloorII2(int target) {
        int result = 1;
        for(int i = 0; i < target; ++i){
            result = result * 2;
        }
        return result;
    }

    public static int JumpFloorII(int target){
        return 1<<(target-1);
    }

    public static void main(String []args){
        System.out.println(JumpFloorII(1));
        System.out.println(JumpFloorII(2));
        System.out.println(JumpFloorII(3));
        System.out.println(JumpFloorII(4));
        System.out.println(JumpFloorII(5));
        System.out.println(JumpFloorII(6));
        System.out.println(JumpFloorII(7));
    }
}
