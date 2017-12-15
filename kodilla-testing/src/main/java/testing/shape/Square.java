package testing.shape;

public class Square implements Shape {
    @Override
    public void getShapeName() {
        System.out.println("Square");
    }

    @Override
    public int getField(int a, int b){
        return a * a;
    }

}
