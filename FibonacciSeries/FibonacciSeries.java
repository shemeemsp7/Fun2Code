import java.util.Arrays;

public class FibonacciSeries {
    
    public static void main(String[] args) {
        //System.out.println(fibonacci(9));
        //System.out.println(fibonacciLoop(9));
        System.out.println(fibonacciLoopWoArr(9));
    }
    //0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ……..
    public static int fibonacci(int n){
       // System.out.println(n);
        if(n <= 1){
            return n;
        }
        return fibonacci(n -1) + fibonacci(n -2);
    } 

    public static int fibonacciLoop(int n){
        int fib[]= new int[n+1];
        fib[0] = 0;
        fib[1] = 1;
        
        for(int i = 2; i <= n; i++) {
            fib[i] = fib[i-1] + fib[i-2];            
        }
        System.out.println(Arrays.toString(fib));
        return fib[n];
    }

    public static int fibonacciLoopWoArr(int n){
        
        int f = 0,s = 1,t=0;
        
        for(int i = 2; i <= n; i++) {
            if(n == 0){
                return n;
            }
            t= f+s;
            f=s;
            s=t;      
        }
        return s;
    }

}
