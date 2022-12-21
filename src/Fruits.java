public class Fruits extends Product {

    public Fruits(String name, double price, String land, double countSl) {
        super(name, price);
        this.setLand(land);
        this.countSl = countSl;
    }
    private String land;
    public String getLand() {
        return land;
    }
    private void setLand(String land) {
        this.land = land;
    }
    public void setCountSl(double countSl){
        this.countSl=countSl;
    }
    private double countSl;
    public double getCountSl() {
        return countSl;
    }


    public String toString() {
        return String.format("%s-%s", super.toString(), land, countSl);
    }
}
