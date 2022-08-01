import java.util.*;
import java.io.*;
class Main {
	public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
		int d =sc.nextInt();
        int q =sc.nextInt();
        if(q==0){
         System.out.println("-1");
        }else{
         System.out.println(d/q);
        }
	}
}
