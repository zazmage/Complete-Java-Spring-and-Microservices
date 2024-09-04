class Laptop{
    String model;
    int price;
    String serial; // This is not being used in the equals method

    @Override
    public String toString(){
        return "Model: " + model + " Price: " + price;
    }

    // Overriding the equals method, this is not recommended
    // public boolean equals(Laptop that){
    //     return this.model.equals(that.model) && this.price == that.price;
    // }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((model == null) ? 0 : model.hashCode());
        result = prime * result + price;
        return result;
    }

    // Overriding the equals method, this is recommended
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Laptop other = (Laptop) obj;
        if (model == null) {
            if (other.model != null)
                return false;
        } else if (!model.equals(other.model))
            return false;
        if (price != other.price)
            return false;
        return true;
}


}

public class ObjectClass {
    public static void main(String[] args) {
        Laptop obj1 = new Laptop();
        obj1.model = "Lenovo Yoga";
        obj1.price = 1000;
        // Every time you print it will call the toString method of the object
        System.out.println(obj1); // Output: Laptop@1b6d3586
        System.out.println(obj1.toString()); // Output: Laptop@1b6d3586
        System.out.println(obj1.getClass().getName()); // Output: Laptop

        // If you want to print the object properties you need to override the toString method
        System.out.println(obj1); // Output: Model: Lenovo Yoga Price: 1000


        Laptop obj2 = new Laptop();
        obj2.model = "Lenovo Yoga";
        obj2.price = 1000;
        System.out.println(obj2); // Output: Model: Dell XPS Price: 1500

        boolean result = obj1 == obj2;
        System.out.println(result); // Output: false

        result = obj1.equals(obj2);
        System.out.println(result); // Output: false


    }
}
