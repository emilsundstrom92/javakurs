class Cone2 extends IceCreamShop {
    public Cone2(int initialCones) {
        super(initialCones);
    }

    @Override
    public int updateNumberOfCones() {
        int conesDetracted = 2;
        numberOfCones -= conesDetracted;
        System.out.println("Subclass2: " + conesDetracted + " cones subtracted. Remaining cones: " + numberOfCones);
        return conesDetracted;
    }

    @Override
    public int updateNumberOfConesIfAvailable() {
        if (numberOfCones > initialCones / 2) {
            return updateNumberOfCones();
        } else {
            System.out.println("Subclass2: Not enough cones to subtract. Remaining cones: " + numberOfCones);
            return 0;
        }
    }
}