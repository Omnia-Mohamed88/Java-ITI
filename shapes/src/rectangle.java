public class rectangle extends shapes {
        private int width;
        private int hight;
        rectangle(int w,int h){
            width=w;
            hight=h;
    }

    @Override
    public void drow() {
        System.out.println("draw rectangel of height"+hight+"and width of"+width);
    }
}