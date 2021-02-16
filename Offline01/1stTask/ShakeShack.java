public class ShakeShack {
    private ShakeMaker shakeMaker;

    public ShakeShack(ShakeMaker shakeMaker)
    {
        this.shakeMaker=shakeMaker;

    }

    public Shake getShake()
    {
        return this.shakeMaker.getShake();
    }

    public void produceShake()
    {
        this.shakeMaker.shakeName();
        this.shakeMaker.addMilk();
        this.shakeMaker.addSweet();
        this.shakeMaker.addIngredient1();
        this.shakeMaker.addIngredient2();
        this.shakeMaker.addTopping();
    }
}
