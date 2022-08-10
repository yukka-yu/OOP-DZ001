package DZ001;

public class Food extends Product {
    private String bestBefore;

    public Food(String name, int price, int quantity, String unit, String bestBefore){
        super(name, price, quantity, unit);
        this.bestBefore = bestBefore;

    }

    @Override
    public String toString(){
        return String.format("%s \nbestBefore: %s", super.toString(), this.bestBefore);
    }
    
}
