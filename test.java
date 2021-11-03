import java.util.Scanner;

class GetInputData
{
  public static void main(String args[])
  {
    int num;
    float fnum;
    String str;
 
        Scanner in = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        num = in.nextInt();
        if (num < 18) {
            System.out.println("Cant vote.");
        } else {
            System.out.println("Can vote");
        }
    }
}

