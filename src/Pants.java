public class Pants extends Clothes implements MenClothing,WomanClothing{
    Pants(Sizes size, String color, double cost){
        super(size,color,cost);
    }

    @Override
    public String toString() {
        return "Шорты: Размер = "+getSize()+", цвет = "+getColor()+", цена = "+getCost();
    }
}
