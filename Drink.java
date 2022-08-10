package DZ001;

public class Drink extends Product {
    int volume;

    public Drink(String name, int price, int quantity, String unit, int volume){
        super(name, price, quantity, unit);
        this.volume = volume;
    }

    // @Override
    // public String toString(){
    //     return String.format("%s\nvolume:\n", super.toString(), this.volume);
    // }
    
}
