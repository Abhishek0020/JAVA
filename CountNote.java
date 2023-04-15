import java.util.Scanner;
public class CountNote {
    public static void main(String[] args) {

        int amt, r2000=0, r500=0, r100=0, r50=0, r20=0, r10=0, r5=0, r2=0 , r1=0 ,count=0;
        System.out.print("Enter The Amount in Rupees : \n\n");
        Scanner skill = new Scanner(System.in);
        amt = skill.nextInt();
        while ( amt >= 500 )
        {
            r500 = amt / 500 ;
            amt = amt % 500;
            System.out.print("\nTotal Number Of 500 Rupees Notes : "+ r500);
            break ;
        }
        while (amt >= 100)
        {
            r100 = amt / 100 ;
            amt = amt % 100;
            System.out.print("\nTotal Number Of 100 Rupees Notes : "+ r100) ;
            break ;
        }
        while (amt >= 20)
        {
            r20 = amt / 20 ;
            amt = amt % 20;
            System.out.print("\nTotal Number Of 20 Rupees Notes : "+ r20) ;
            break ;
        }
        while (amt >= 10)
        {
            r10 = amt / 10 ;
            amt = amt % 10;
            System.out.print("\nTotal Number Of 10 Rupees Notes Or Coin : "+ r10);
            break ;
        }
        while ( amt >= 5 )
        {
            r5 = amt / 5 ;
            amt = amt % 5;
            System.out.print("\nTotal Number Of 5 Rupees Notes Or Coin : "+ r5) ;
            break ;
        }
        while ( amt >= 2 )
        {
            r2 = amt / 2 ;
            amt = amt % 2;
            System.out.print("\nTotal Number Of 2 Rupees Notes Or Coin : "+ r2) ;
            break ;
        }
        while ( amt >= 1 )
        {
            r1 = amt / 1 ;
            amt = amt % 1;
            System.out.print("\nTotal Number Of 1 Rupees Note Or Coin : "+ r1 ) ;
            break ;
        }
        count = r500 + r100 + r20 + r10 + r5 + r2 + r1;
    }
}
