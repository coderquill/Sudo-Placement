{
import java.util.*;
import java.math.*;
class Multiply{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            String a=sc.next();
            String b=sc.next();
            multiplyTwoStrings g=new multiplyTwoStrings();
            System.out.println(g.multiply(a,b));
        }
    }
}
}

//User function Template for Java
class multiplyTwoStrings{
    
    public String multiply(String a,String b){
        return (new BigInteger(a)).multiply(new BigInteger(b)).toString();
        }
}
