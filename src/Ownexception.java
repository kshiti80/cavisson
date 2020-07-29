import java.util.Scanner;

class ThrowExpDetecteds extends Exception{

    ThrowExpDetecteds(String s) {
      super(s);

    }
}

public class Ownexception {
    static void check(int n)throws ThrowExpDetecteds {
        if (n > 10)
            throw new ThrowExpDetecteds("enter a valid no.");
        else
            System.out.println("entered no. is: "+n);
    }
    public static void main(String[] args)  {
        Scanner in=new Scanner(System.in);
        System.out.println("enter no.");
        int n=in.nextInt();
       try {
            check(n);
       }
       catch (Exception e) {
           System.out.println("wrong");
       }


       }
    }


