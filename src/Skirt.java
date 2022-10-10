public class Skirt extends Clothes implements WomanClothing {
    public Skirt(Sizes size, String color, double cost){
        super(size,color,cost);
    }

    @Override
    public String toString() {
        return "Юбка: Размер = "+getSize()+", цвет = "+getColor()+", цена = "+getCost();
    }
}