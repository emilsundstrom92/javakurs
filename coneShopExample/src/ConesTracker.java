class ConesTracker {
    private int totalConesDetracted = 0;

    public void trackConesDetracted(int conesDetracted) {
        totalConesDetracted += conesDetracted;
    }

    public void printTotalConesDetracted() {
        System.out.println("Total cones detracted by both subclasses: " + totalConesDetracted);
    }
}