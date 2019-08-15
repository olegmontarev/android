public class DataStructures {

    public static void main (String[] args){

        DataStructures dataStructures = new DataStructures();
        dataStructures.StringReverse("Hello");

    }

    public DataStructures(){}

    public void StringReverse(String string){
        StackImpl stack = new StackImpl(100);
        for(int i=0; i<5;i++){
            stack.push(string.charAt(i));}
        for (int i=0; i<6;i++){
            stack.pop();
        }
        }

}
