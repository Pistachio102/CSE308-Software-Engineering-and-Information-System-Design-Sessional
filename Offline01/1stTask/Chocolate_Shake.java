public class Chocolate_Shake implements ShakeMaker{
    private Shake chocolateShake;
    private String shakeName;
    private String milk;
    private String topping;

    public Chocolate_Shake(String n,String m, String t) {
        this.chocolateShake = new Shake();
        this.shakeName=n;
        this.milk=m;
        this.topping=t;
    }

    @Override
    public void shakeName() {
        chocolateShake.setName(this.shakeName);

    }

    @Override
    public void addMilk() {
        chocolateShake.setMilktype(this.milk);
    }

    @Override
    public void addSweet() {
        chocolateShake.setSweetenerType("Sugar");

    }

    @Override
    public void addIngredient1() {
        chocolateShake.setIngredient1("Chocolate Syrup");

    }

    @Override
    public void addIngredient2() {
        chocolateShake.setIngredient2("Chocolate Ice-cream");

    }

    @Override
    public void addTopping() {
        chocolateShake.setTopping(this.topping);

    }

    @Override
    public Shake getShake() {
        return chocolateShake;
    }


}
