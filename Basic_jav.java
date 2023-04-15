import java.util.Scanner;
import java.lang.String;
public class Basic_jav{
    public static void main(String[] args) {
        String name;
        int age;
        float height;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the name : ");
        name=sc.nextLine();

        System.out.println("enter the name again :");
        String name2= sc.next();
        sc.nextLine();

        System.out.println("enter your age :");
        age=sc.nextInt();

        System.out.println("enter the height :");
        height=sc.nextFloat();

        System.out.println("introduction : ");
        System.out.println("name"+name);
        System.out.println("age :"+age);
        System.out.println("height : "+height+"cm");

    }
}
