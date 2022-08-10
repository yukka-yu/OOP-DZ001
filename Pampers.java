package DZ001;

public class Pampers extends Kids{
    String size;
    int minWeight, maxWeight;
    String type;

    public Pampers(String name, int price, int quantity, String unit, int minAge, String hypoallergenic, String size, int minWeight, int maxWeight, String type){
        super(name, price, quantity, unit, minAge, hypoallergenic);
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
        this.type = type;
        this.size = size;
    }

    @Override
    public String toString(){
        return String.format("%s\nminimal weight: %d\nmaximal weight: %d\ntype: %s\nsize: %s", 
                                super.toString(), this.minWeight, this.maxWeight, this.type, this.size);
    }
    
}
