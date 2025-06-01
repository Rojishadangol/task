//accessModifier class classname{class Body}
//private-- personal dairy
//public-- census data
//default-- group chat
//protected-- family house

public class Laptop{
    private String model;
    private String color;
    private Double price;
    //setter to set value to attribute
    public void setModel(String model){
        this.model=model;
    }
        public void setColor(String color){
        this.color=color;
    }
        public void setPrice(String price){
        this.price=price;
    }
    //getter to return valur=e of an attribute
    public String getModel(){
        return model;
    }
        public String getColor(){
        return color;
    }
    public Double getPrice(){
        return price;
    }





    //openApp closeApp turnOn turnOff
    // public void openApp(){}
    // public void closeApp(){}
    // public void turnOn(){}
    // public void turnOff(){}
}
class DriverClass{
    public static void main(String [] args){
        Laptop vivoBook= new Laptop();

        vivoBook.setColor("Black");
        System.out.println(vivoBook.getColor());
                vivoBook.setModel("Asus vivobook");
        System.out.println(vivoBook.getModel());
                vivoBook.setPrice("80000.00");
        System.out.println(vivoBook.getPrice());


        //here
        //identity--Name--vivoBook
        //property-- attributr -- price,model,color
        //behavior-- method--
        // vivoBook.model="Asus VivoBook";
        // vivoBook.price=82000.00;
        // vivoBook.openApp();
        // vivoBook.closeApp();
        // vivoBook.turnOff();
        // vivoBook.turnOn();
    }
}

