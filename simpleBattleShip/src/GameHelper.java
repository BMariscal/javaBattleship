import java.util.Scanner;

public class GameHelper {

    public String getUserInput(){
        Scanner reader = new Scanner(System.in);
        System.out.print("Please guess a number: ");
        String guessNum = reader.nextLine();
        String guess = "0";
        Boolean isItNum = isNum(guessNum);

        if (guessNum.length() > 0 && isItNum){
            guess = guessNum;
        }else{
            System.out.println("Try again, incorrect input");

        }
     return guess;
    }

    public static Boolean isNum(String guessNum){
        try{
            int isNum = Integer.parseInt(guessNum);
            if (isNum >= 0){
                return true;
            }


        }catch(NumberFormatException ex){
            return false;
        }

        return false;
    }


}
