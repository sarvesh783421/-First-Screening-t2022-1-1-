import java.util.Scanner;

public class Problem3 {
    static int a;

    static void input(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number (x) :- ");
        a = input.nextInt();
    }
    static void output(){
        if(a%2==0){
            for(int i=1; i<(2*a)-1; i++){
                if(i%2==0)
                    continue;
                else
                    System.out.println(i);
            }
        }
        else if(a%2!=0){
            for(int i=1; i<=2*a; i++){
                if(i%2==0)
                    continue;
                else
                    System.out.println(i);
            }
        }

    }

    public static void main(String[] args) {
        input();
        output();
    }
}
