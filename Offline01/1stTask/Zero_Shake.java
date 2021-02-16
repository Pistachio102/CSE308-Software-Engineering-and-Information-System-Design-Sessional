public class Zero_Shake implements ShakeMaker {
    private Shake zeroShake;
    private String shakeName;
    private String milk;
    private String topping;

    public Zero_Shake(String n,String m, String t) {
        this.zeroShake = new Shake();
        this.shakeName=n;
        this.milk=m;
        this.topping=t;
    }

    @Override
    public void shakeName() {
        zeroShake.setName(this.shakeName);
    }

    @Override
    public void addMilk() {
        zeroShake.setMilktype(this.milk);
    }

    @Override
    public void addSweet() {
        zeroShake.setSweetenerType("Sweetener");

    }

    @Override
    public void addIngredient1() {
        zeroShake.setIngredient1("Vanilla Flavouring");

    }

    @Override
    public void addIngredient2() {
        zeroShake.setIngredient2("Sugar-Free Jello");

    }

    @Override
    public void addTopping() {
        zeroShake.setTopping(this.topping);

    }

    @Override
    public Shake getShake() {
        return zeroShake;
    }


}
