public class SimpleDotComTestDrive {

    public static void main(String[] args) {
        SimpleDotCom obj = new SimpleDotCom();
        int[] locationsArray = {2, 3, 4};
        obj.setLocations(locationsArray);
        String userGuess = "4";
        Boolean result = obj.checkforMatch(userGuess);
        if (result) {
            System.out.print("passed");
        } else {
            System.out.print("FAILED test, guess not in locationsArray");
        }
    }
}
