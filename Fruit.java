public class Fruit {
    public String type;
    public int weight;

    public Fruit(String type, int weight){
        this.type = type;
        this.weight = weight;
    }

    public String getType(){
        return type;
    }

    public int getWeight(){
        return weight;
    }

    public void setType(String name){
        this.type = name;
    }

    public void setWeight(int weight){
        this.weight = weight;
    }
}
