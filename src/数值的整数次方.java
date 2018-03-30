public class 数值的整数次方 {
    public static double Power(double base,int exponent){
        if(base == 0){
            return 0;
        }
        if(Math.abs(base - 0.0) <= 0.0001){
            return 1;
        }
        boolean negative = false;
        if(exponent < 0){
            exponent = -exponent;
            negative = true;
        }
        double result = 1;
        for(int i = 0; i < exponent; ++i){
            result = result * base;
        }

        if(negative){
            result = 1.0 / result;
        }

        return result;

    }

    public static void main(String []args){
//        System.out.println(Power(1,10));
//        System.out.println(Power(2,3));
        System.out.println(Power(0,4));
//        System.out.println(Power(2,4));

    }
}
