import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        String alpha = "abcdefghijklmnopqrstuvwxyz";
        String result  = " ";

        System.out.println("Please enter a word:");
        String user = myObj.nextLine();
        int y = user.length();

        int end = y-1;
        for (int i = 0; i < y; i++){

            String letter = user.substring(i);
            int num = alpha.indexOf(letter);

            if (i == end)
            {
                result += (num);
            }
            else {
                result += (num + "-");
            }
        }

        System.out.println(result);


    }

}
