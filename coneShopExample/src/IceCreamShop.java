abstract class IceCreamShop {
    protected static int numberOfCones;
    protected  int initialCones;

    public IceCreamShop(int initialCones) {
        this.numberOfCones = initialCones;
        this.initialCones = initialCones;
    }

    public abstract int updateNumberOfCones();

    public abstract int updateNumberOfConesIfAvailable();
}