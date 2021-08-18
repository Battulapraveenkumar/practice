public class AreaAndPerimeterOfRectangle {
    int Length,Breadth;
    public  AreaAndPerimeterOfRectangle(int Length,int Breadth){
        this.Length=Length;
        this.Breadth=Breadth;
    }
    public int Perimeter() {
        return 2*(Length+Breadth);
    }
}
