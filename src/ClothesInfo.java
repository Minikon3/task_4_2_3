public class ClothesInfo {
    public void menInfo(Clothes[] clothes){
        System.out.println("Мужская одежда: ");
        for (Clothes clothe : clothes){
            if(clothe instanceof MenClothing){
                System.out.println(clothe);
            }
        }
    }
    public void womenInfo(Clothes[] clothes){
        System.out.println("Женская одежда: ");
        for (Clothes clothe : clothes){
            if(clothe instanceof WomanClothing){
                System.out.println(clothe);
            }
        }
    }
}
