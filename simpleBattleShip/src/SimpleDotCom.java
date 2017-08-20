public class SimpleDotCom {
    private int[] locations;
    public void setLocations(int[] arr){
        locations = arr;
    }
    public int[] getLocations(){
        return locations;
    }

    public boolean checkforMatch(String guess){
        int guessNum = Integer.parseInt(guess);
        int[] myLocations = getLocations();
        for (int location : myLocations){
            if (guessNum == location){
                return true;
            }
        }
        return false;

    }

}
