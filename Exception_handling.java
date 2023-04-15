import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception_handling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("enter the two number : ");
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println("devision " + (a/b));
            throw new NumberFormatException("manually thrown exception : ");
        } catch (ArithmeticException e) {
            System.out.println("inside arithmetic exception block : ");
            System.out.println("enter the non zero number :  : ");
        }
        catch (InputMismatchException e){
            System.out.println("inside InputMissMatchException catch block : ");
            System.out.println("give the proper number : ");
        }
        catch(Exception e){
            System.out.println(e);
            System.out.println("inside the exception block");
        }
        finally {
            System.out.println("inside finally : ");
        }
        System.out.println("end of program :");
    }
    public static int division(int a,int b) throws ArithmeticException{
        int div=a/b;
        return div;
    }
}