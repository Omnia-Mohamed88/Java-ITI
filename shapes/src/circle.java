public class circle extends shapes {
    private int rad;
    circle(int r){
        rad=r;
    }

    @Override
    public void drow() {
        System.out.println("draw circle of radius "+rad);
    }
}
