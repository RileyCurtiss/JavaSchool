public class testprogr {
    

public static long combRec(long n, long k){
    if (n==k || k==0)
        return 1;
    else
        return combRec(n-1,k-1) + combRec(n-1,k);
}
public static void main (String [] args) {
System.out.println(combRec(4,2));
}
}
