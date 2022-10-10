public class TShirt extends Clothes implements MenClothing,WomanClothing {
    public TShirt(Sizes size, String color, double cost){
        super(size,color,cost);
    }

    @Override
    public String toString() {
        return "Футболка: Размер = "+getSize()+", цвет = "+getColor()+", цена = "+getCost();
    }
}
