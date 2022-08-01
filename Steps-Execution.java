import java.util.*;
import java.io.*;
class Main {
    public static void main (String[] args) {
        Scanner Sc = new Scanner(System.in);
        int a = Sc.nextInt();
        System.out.print((((((a)+8)/3)%5)*5));  
    }
}
