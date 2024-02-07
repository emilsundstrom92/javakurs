class Cone1 extends IceCreamShop {
    public Cone1(int initialCones) {
        super(initialCones);
    }

    @Override
    public int updateNumberOfCones() {
        int conesDetracted = 1;
        numberOfCones -= conesDetracted;
        System.out.println("Subclass1: " + conesDetracted + " cone subtracted. Remaining cones: " + numberOfCones);
        return conesDetracted;
    }

    @Override
    public int updateNumberOfConesIfAvailable() {
        if (numberOfCones > initialCones / 2) {
            return updateNumberOfCones();
        } else {
            System.out.println("Subclass1: Not enough cones to subtract. Remaining cones: " + numberOfCones);
            return 0;
        }
    }
}