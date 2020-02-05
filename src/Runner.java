public class Runner {


    public static void main(String[] args) {
        int[] x = {2,3,5,6,7};
        System.out.println(icyHot(30, 50));
        System.out.println(helloName("finn"));
        System.out.println(swapEnds(x));
        System.out.println(squirrelPlay(60, true));
        System.out.println(countXX("xxabcxx"));
        System.out.println(roundSum(61, 24, 54));
        System.out.println(repeatEnd("abcddlk", 3));
    }


    public static boolean icyHot(int temp1, int temp2) {
        if ((temp1 < 0 && temp2 > 100) || (temp1 > 100 && temp2 < 0)){
            return true;
        }else{
            return false;
        }
    }

    public static String helloName(String name) {
        String greeting = "Hello ";
        String ending = "!";
        return greeting + name + ending;
    }

    public static int[] swapEnds(int[] nums) {
        int first = nums[0];
        int last = nums[nums.length - 1];
        nums[0] = last;
        nums[nums.length - 1] = first;
        return nums;

    }
    public static boolean squirrelPlay(int temp, boolean isSummer) {
        if(isSummer){
            if((temp >= 60) && (temp<=100)){
                return true;
            }else{
                return false;
            }
        }else{
            if((temp >= 60) && (temp <= 90)){
                return true;
            }else{
                return false;
            }
        }
    }

    public static int countXX(String str) {
        int count = 0;
        for(int i = 0; i<str.length()-1;i++){
            if(str.substring(i,i+2) .equals("xx")){
                count ++;
            }
        }
        return count;
    }
    public static int roundSum(int a, int b, int c) {
        int A = round(a);
        int B = round(b);
        int C = round(c);
        return  A + B + C;
    }

    public static int round (int num){
        if(num - 5 >= (Math.round(num/10)*10)){
            return (Math.round((num/10)+1)*10);
        }
        return  (Math.round(num/10)*10);
    }
    public static String repeatEnd(String str, int n) {
        String repeat = "";
        int N = str.length()-n;
        for(int i = 0; i<n; i++){
            repeat += str.substring(N,str.length());
        }
        return repeat;
    }


}