package DZ001;

public class Bread extends Food {
    String flour;

    public Bread(String name, int price, int quantity, String unit, String bestBefore, String flour){
        super(name, price, quantity, unit, bestBefore);
        this.flour = flour;
    }
    
    // @Override
    // public String toString(){
    //     return String.format("%s\nflour: %s", super.toString(), this.flour);
    // }
}
