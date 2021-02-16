public class Vanilla_Shake implements ShakeMaker {
    private Shake vanillaShake;
    private String shakeName;
    private String milk;
    private String topping;

    public Vanilla_Shake(String n,String m, String t) {
        this.vanillaShake = new Shake();
        this.shakeName=n;
        this.milk=m;
        this.topping=t;
    }

    @Override
    public void shakeName() {
        vanillaShake.setName(this.shakeName);
    }

    @Override
    public void addMilk() {
        vanillaShake.setMilktype(this.milk);
    }

    @Override
    public void addSweet() {
        vanillaShake.setSweetenerType("Sugar");

    }

    @Override
    public void addIngredient1() {
        vanillaShake.setIngredient1("Vanilla Flavouring");

    }

    @Override
    public void addIngredient2() {
        vanillaShake.setIngredient2("Jello");

    }

    @Override
    public void addTopping() {
        vanillaShake.setTopping(this.topping);

    }

    @Override
    public Shake getShake() {
        return vanillaShake;
    }


}
