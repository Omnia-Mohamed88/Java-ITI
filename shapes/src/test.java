import java.util.List;
public class test {
    public void testFun(List<? extends shapes> sh){
        for(shapes shape :sh){
            shape.drow();

        }
    }
}
