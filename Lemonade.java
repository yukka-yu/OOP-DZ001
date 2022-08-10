package DZ001;

public class Lemonade extends Drink{

    public Lemonade(String name, int price, int quantity, String unit, int volume){
    
            super(name, price, quantity, unit, volume);
    }

    @Override
    public String toString(){
        return String.format("%s", super.toString());
    }
}
