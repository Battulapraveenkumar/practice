import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AreaAndPerimeterOfSquareTest {
    @Test
    public void ToReturnPerimeterOfSquarePositiveLength()
    {
        AreaAndPerimeterOfSquare obj = new AreaAndPerimeterOfSquare(4);
        int expectedArea = 16;
        int actualArea = obj.Perimeter();
        assertEquals(expectedArea,actualArea);
    }
    @Test
    public void ToReturnPerimeterOfSquareNegativeLength()
    {
        AreaAndPerimeterOfSquare obj = new AreaAndPerimeterOfSquare(-5);
        int expectedArea = -20;
        int actualArea = obj.Perimeter();
        assertEquals(expectedArea,actualArea);
    }
}
