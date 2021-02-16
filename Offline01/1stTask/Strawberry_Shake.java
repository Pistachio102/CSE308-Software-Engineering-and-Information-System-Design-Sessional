public class Strawberry_Shake implements ShakeMaker {
    private Shake strawberryShake;
    private String shakeName;
    private String milk;
    private String topping;

    public Strawberry_Shake(String n,String m, String t) {
        this.strawberryShake = new Shake();
        this.shakeName=n;
        this.milk=m;
        this.topping=t;
    }

    @Override
    public void shakeName() {
        strawberryShake.setName(this.shakeName);
    }

    @Override
    public void addMilk() {
        strawberryShake.setMilktype(this.milk);
    }

    @Override
    public void addSweet() {
        strawberryShake.setSweetenerType("Sugar");

    }

    @Override
    public void addIngredient1() {
        strawberryShake.setIngredient1("Strawberry Syrup");

    }

    @Override
    public void addIngredient2() {
        strawberryShake.setIngredient2("Strawberry Ice-cream");

    }

    @Override
    public void addTopping() {
        strawberryShake.setTopping(this.topping);

    }

    @Override
    public Shake getShake() {
        return strawberryShake;
    }


}
