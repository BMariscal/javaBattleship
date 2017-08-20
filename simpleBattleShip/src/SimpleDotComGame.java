public class SimpleDotComGame {

    public static void main(String[] args) {
        GameHelper playerGuessInput = new GameHelper();
        SimpleDotCom obj = new SimpleDotCom();
        int randomNum = (int) (Math.random() * 5 + 1);
        int[] locationsArray;
        locationsArray = new int[]{randomNum, randomNum + 1, randomNum + 2};
        obj.setLocations(locationsArray);
        int numGuesses = 0;
        int numHits = 0;
        int[] arrayOfHits = new int[3];
        String message = "MISS";
        Boolean win = false;
        Boolean empty = true;


        while (!win) {
        String userGuess = playerGuessInput.getUserInput();
        Boolean check = obj.checkforMatch(userGuess);

            if (check && notInHits(userGuess, arrayOfHits, empty)) {
                int userG = Integer.parseInt(userGuess);

                arrayOfHits[numHits] = userG;
                empty = false;
                numHits++;
                numGuesses++;
                System.out.println("HIT");



            } else if (check && !notInHits(userGuess, arrayOfHits, empty)) {
                System.out.println("You've already entered that number");

            } else {
                numGuesses++;
                System.out.println(message);

            }


            if (numHits == 3) {
                win = true;
                System.out.println("KILL");

                System.out.println("It took you " + numGuesses + " guesses to get the correct answer");


            }
        }
    }



    private static Boolean notInHits(String guess, int[] arrOfHits, Boolean empty) {
        Boolean answer = true;


        if (!empty) {
            for (int items : arrOfHits) {

                if (Integer.parseInt(guess) == items) {
                    answer = false;
                    break;

                }
            }
            return answer;
        }

        return answer;

    }
}
