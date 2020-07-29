import java.util.*;
public class ExceptionCheck {
    public ExceptionCheck(String s) {
    }

    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        System.out.println("enter  input ns and var");
        int ns=in.nextInt();
        int var=in.nextInt();
        int ans=0;
        try{
            ans=ns/var;

        }
        catch(java.lang.Exception e) {
            System.out.println(e);
            System.out.println("enter correct input");
        }
    }
}
