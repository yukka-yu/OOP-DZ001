package DZ001;

public class Eggs extends Food {
    
    int eggPerPack;

    public Eggs(String name, int price, int quantity, String unit, String bestBefore, int eggPerPack){

        super(name, price, quantity, unit, bestBefore);
        this.eggPerPack = eggPerPack;
    }
    
    @Override
    public String toString(){
        return String.format("%s\neggs per pack: %d", super.toString(), this.eggPerPack);
    }
}
