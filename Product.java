package DZ001;
import java.lang.reflect.Field;

public class Product {

    protected String name;
    protected int price;
    protected int quantity;
    protected String unit;


    /**Это конструктор */
    public Product(String name, int price, int quantity, String unit){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.unit = unit;
    }

    // @Override
    // public String toString(){
    //     String a = super.toString() + "\n";

    //     Field[] fields = this.getClass().getDeclaredFields();

    //     for (Field field:fields){
    //         try {
    //             a += field.getName() + ": " + field.get(this) + "\n";
    //         } 
    //         catch (Exception e) {
    //             System.out.println(e.getMessage());
    //             a += "---";
            
    //         }
    //     }

    //     return a;
    // }


    @Override
    public String toString(){
        return String.format("\nname: %s\nprice: %d\namount: %d\nunit: %s",
                this.name, this.price, this.quantity, this.unit);
    }

    
}
