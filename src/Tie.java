public class Tie extends Clothes implements MenClothing {
    public Tie(Sizes size, String color, double cost){
        super(size,color,cost);
    }

    @Override
    public String toString() {
        return "Галстук: Размер = "+getSize()+", цвет = "+getColor()+", цена = "+getCost();
    }
}