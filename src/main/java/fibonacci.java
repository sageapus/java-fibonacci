import java.util.Scanner;

public class fibonacci {
    static int fib(int n){
        if (n<=1){
            return n;
        }
        return fib(n-1)+(n-2);
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter num");
        int scan=scanner.nextInt();

        int n=scan;
        for (int i=0;i<n;i++){
            System.out.println(fib(i));


        }



    }


}
