public class Main {
    public static void main(String[] args) {
        Clothes[] clothes = {
                new TShirt(Sizes.XS,"Красный",2500),
                new TShirt(Sizes.XXS,"Белый",1500),
                new Pants(Sizes.L,"Коричневый",3500),
                new Pants(Sizes.L,"Синий",2200),
                new Skirt(Sizes.S,"Тёмно-зелёный",5500),
                new Tie(Sizes.M,"Чёрный",3300),
        };
        ClothesInfo info = new ClothesInfo();
        info.menInfo(clothes);
        System.out.println();
        info.womenInfo(clothes);
    }
}