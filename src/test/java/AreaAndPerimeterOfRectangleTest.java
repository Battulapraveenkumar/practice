import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AreaAndPerimeterOfRectangleTest {
    @Test
    public void ToReturnAreaOfRectanglePositiveLengthAndPositiveWidth()
    {
        AreaAndPerimeterOfRectangle obj = new AreaAndPerimeterOfRectangle(4,5);
        int expectedArea = 20;
        int actualArea = obj.Area();
        assertEquals(expectedArea,actualArea);
    }
    @Test
    public void ToReturnAreaOfRectanglePositiveLengthAndNegativeWidth()
    {
        AreaAndPerimeterOfRectangle obj = new AreaAndPerimeterOfRectangle(4,-5);
        int expectedArea = -20;
        int actualArea = obj.Area();
        assertEquals(expectedArea,actualArea);
    }
    @Test
    public void ToReturnAreaOfRectangleNegativeLengthAndPositiveWidth()
    {
        AreaAndPerimeterOfRectangle obj = new AreaAndPerimeterOfRectangle(-4,5);
        int expectedArea = -20;
        int actualArea = obj.Area();
        assertEquals(expectedArea,actualArea);
    }
    @Test
    public void ToReturnAreaOfRectangleNegativeLengthAndNegativeWidth()
    {
        AreaAndPerimeterOfRectangle obj = new AreaAndPerimeterOfRectangle(-4,-5);
        int expectedArea = 20;
        int actualArea = obj.Area();
        assertEquals(expectedArea,actualArea);
    }
}
