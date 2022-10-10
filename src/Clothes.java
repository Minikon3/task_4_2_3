public class Clothes {
    private Sizes size;
    private String color;
    private double cost;
    public Clothes(Sizes size, String color, double cost){
        this.size=size;
        this.color=color;
        this.cost=cost;
    }

    public Sizes getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

    public double getCost() {
        return cost;
    }
}
