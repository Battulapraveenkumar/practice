import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AreaAndPerimeterOfRectangleTest {
    @Test
    public void ToReturnPerimeterOfRectanglePositiveLengthAndPositiveWidth()
    {
        AreaAndPerimeterOfRectangle obj = new AreaAndPerimeterOfRectangle(4,5);
        int expectedArea = 18;
        int actualArea = obj.Perimeter();
        assertEquals(expectedArea,actualArea);
    }
    @Test
    public void ToReturnPerimeterOfRectanglePositiveLengthAndNegativeWidth()
    {
        AreaAndPerimeterOfRectangle obj = new AreaAndPerimeterOfRectangle(4,-5);
        int expectedArea = -2;
        int actualArea = obj.Perimeter();
        assertEquals(expectedArea,actualArea);
    }
    @Test
    public void ToReturnPerimeterOfRectangleNegativeLengthAndPositiveWidth()
    {
        AreaAndPerimeterOfRectangle obj = new AreaAndPerimeterOfRectangle(-4,5);
        int expectedArea = 2;
        int actualArea = obj.Perimeter();
        assertEquals(expectedArea,actualArea);
    }
    @Test
    public void ToReturnPerimeterOfRectangleNegativeLengthAndNegativeWidth()
    {
        AreaAndPerimeterOfRectangle obj = new AreaAndPerimeterOfRectangle(-4,-5);
        int expectedArea = -18;
        int actualArea = obj.Perimeter();
        assertEquals(expectedArea,actualArea);
    }
}
