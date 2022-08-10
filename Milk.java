package DZ001;

public class Milk extends Drink {
    double fat;
    String bestBefore;

    public Milk(String name, int price, int quantity, String unit, int volume, double fat, String bestBefore){

        super(name, price, quantity, unit, volume);
        this.fat = fat;
        this.bestBefore = bestBefore;
    }

    // @Override
    // public String toString(){
    //     return String.format("%s\nfat content: %,.1f\nbest before: %s", super.toString(), this.fat, this.bestBefore);
    // }
    
}
