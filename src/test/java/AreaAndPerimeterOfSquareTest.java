import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AreaAndPerimeterOfSquareTest {
    @Test
    public void ToReturnAreaOfSquarePositiveLength()
    {
        AreaAndPerimeterOfSquare obj = new AreaAndPerimeterOfSquare(4);
        int expectedArea = 16;
        int actualArea = obj.Area();
        assertEquals(expectedArea,actualArea);
    }
    @Test
    public void ToReturnAreaOfSquareNegativeLength()
    {
        AreaAndPerimeterOfSquare obj = new AreaAndPerimeterOfSquare(-5);
        int expectedArea = 25;
        int actualArea = obj.Area();
        assertEquals(expectedArea,actualArea);
    }
}
