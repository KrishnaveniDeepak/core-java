import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner sc=new Scanner(System.in);
        int index=0;
        System.out.printf("Enter the element");
        int n=sc.nextInt();
        int flag=0;
        for(int i=2;i<=n/2;i++)
        {
             if(n%i==0)
             {
                 flag=1;
                 break;
             }
        }
        if(flag==0)
        {
            System.out.printf("prime number");
        }
        else{
            System.out.printf("not a prime number");
        }
        }
    }