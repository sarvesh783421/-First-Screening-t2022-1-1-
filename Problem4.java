public class Problem4 {
    static int[] arr = {1,2,8,9,12,46,76,82,15,20,30};
    static int count1(int[] arr){
        int count = 0;
        for (int a : arr) {
            if(a%1==0){
                count++;
            }
        }
        return count;
    }
    static int count2(int[] arr){
        int count = 0;
        for (int a : arr) {
            if(a%2==0){
                count++;
            }
        }
        return count;
    }
    static int count3(int[] arr){
        int count = 0;
        for (int a : arr) {
            if(a%3==0){
                count++;
            }
        }
        return count;
    }
    static int count4(int[] arr){
        int count = 0;
        for (int a : arr) {
            if(a%4==0){
                count++;
            }
        }
        return count;
    }
    static int count5(int[] arr){
        int count = 0;
        for (int a : arr) {
            if(a%5==0){
                count++;
            }
        }
        return count;
    }
    static int count6(int[] arr){
        int count = 0;
        for (int a : arr) {
            if(a%6==0){
                count++;
            }
        }
        return count;
    }
    static int count7(int[] arr){
        int count = 0;
        for (int a : arr) {
            if(a%7==0){
                count++;
            }
        }
        return count;
    }
    static int count8(int[] arr){
        int count = 0;
        for (int a : arr) {
            if(a%8==0){
                count++;
            }
        }
        return count;
    }
    static int count9(int[] arr){
        int count = 0;
        for (int a : arr) {
            if(a%9==0){
                count++;
            }
        }
        return count;
    }


    public static void main(String[] args) {
        int a = count1(arr);
        int b = count2(arr);
        int c = count3(arr);
        int d = count4(arr);
        int e = count5(arr);
        int f = count6(arr);
        int g = count7(arr);
        int h = count8(arr);
        int i = count9(arr);

        System.out.printf("%d:%d,%d:%d,%d:%d,%d:%d,%d:%d,%d:%d,%d:%d,%d:%d,%d:%d", 1,a, 2,b, 3,c, 4,d, 5,e, 6,f, 7,g, 8,h, 9,i);
    }
}
