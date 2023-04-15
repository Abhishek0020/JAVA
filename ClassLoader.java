import java.util.Scanner;
public class ClassLoader {
    int arr[];
    int top;
    ClassLoader()
    {
        arr=new int[5];
        top=-1;
    }
    void push()
    {
        if(top==arr.length-1)
        {
            System.out.println("Stack full");
        }
        else
        {
            System.out.println("enter the data: ");
            Scanner sc=new Scanner(System.in);
            int data=sc.nextInt();
            top=top+1;
            arr[top]=data;
            System.out.println("data inserted");
        }

    }
    void pop()
    {
        System.out.println("deleted: "+arr[top]);
        top=top-1;
    }
    void traverse()
    {
        if(top==-1)
        {
            System.out.println("empty stack");
        }
        else
        {
            for(int i=top;i>=0;i--)
            {
                System.out.println(arr[i]);
            }
        }

    }

}
class main
{
    public static void main(String args[])
    {
        ClassLoader obj=new ClassLoader();
        Scanner sc=new Scanner(System.in);

        while(true)
        {
            System.out.println("press 1 for insert: ");
            System.out.println("press 2 for deletion: ");
            System.out.println("press 3 for traverse: ");
            System.out.println("press 4 for exit: ");
            int choice=sc.nextInt();
            switch(choice)
            {
                case 1:
                    obj.push();
                    break;
                case 2:
                    obj.pop();
                    break;
                case 3:
                    obj.traverse();
                case 4:
                    System.exit(0);
                default:
                    System.out.println("wrong " +"chooice");

            }

        }

    }
}