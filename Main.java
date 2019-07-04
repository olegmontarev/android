public class Main {
    public static void main (String[] args){
        Integer[] newArray = new Integer[5];
        String[] strArray = new String[5];
        newArray[0] = 1;
        newArray[1] = 2;
        newArray[2] = 3;
        newArray[3] = 4;
        newArray[4] = 5;
        strArray[0] = "a";
        strArray[1] = "b";
        strArray[2] = "c";
        strArray[3] = "d";
        strArray[4] = "e";

        ArrayReplace arrayReplace = new ArrayReplace();
        ArrayToList arrayToList = new ArrayToList();

        arrayReplace.change(newArray);
        arrayReplace.change(strArray);
        arrayToList.toList(strArray);
    }
}
