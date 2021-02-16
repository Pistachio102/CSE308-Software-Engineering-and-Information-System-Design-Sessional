public class Coffee_Shake implements ShakeMaker {
    private Shake coffeeShake;
    private String shakeName;
    private String milk;
    private String topping;

    public Coffee_Shake(String n,String m, String t) {
        this.coffeeShake = new Shake();
        this.shakeName=n;
        this.milk=m;
        this.topping=t;
    }

    @Override
    public void shakeName() {
        coffeeShake.setName(this.shakeName);
    }

    @Override
    public void addMilk() {
        coffeeShake.setMilktype(this.milk);
    }

    @Override
    public void addSweet() {
        coffeeShake.setSweetenerType("Sugar");

    }

    @Override
    public void addIngredient1() {
        coffeeShake.setIngredient1("Coffee");

    }

    @Override
    public void addIngredient2() {
        coffeeShake.setIngredient2("Jello");

    }

    @Override
    public void addTopping() {
        coffeeShake.setTopping(this.topping);

    }

    @Override
    public Shake getShake() {
        return coffeeShake;
    }


}
