
public class fibonacci{
    public static void main(String[] args) {
    
    }
    
    public static int fiborec(int n){
        if (n <= 0) {
            return n;
        }
    
        int a = fiborec(n - 1);
        int b = fiborec(n - 2);
        
        return a+b;
    }
    
    public static int fibo(int n){
        if (n == 0) {
            return 0;
        } else if ( n == 1) {
            return 1;
        }
        
        int f [] = new int[n+1];
        
        for(int i= 2; i <= n; i++){
            f[i] = f[i-1] + f[i-2];
        }
        
        return f[n];
    }
    
    public static int memoizedFibo(int f[], int n){
        for(int i=0; i<=n;i++){
            f[i] = -1;
        }
        
        return lookupFibo(f, n);
    }
    
    public static int lookupFibo(int f[], int n){
        if (f[n] >= 0) {
            return f[n];
        }
        
        if (n <= 1) {
            return f[n] = n;
        }
        
        f[n] = lookupFibo(f, n-1) + lookupFibo(f, n-2);
        
        return f[n];
    }
}