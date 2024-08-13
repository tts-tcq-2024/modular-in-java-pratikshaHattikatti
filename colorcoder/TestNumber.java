package colorcoder;

public class TestNumber {
	
	ColorPair colorPair = new ColorPair();
	
    public void testNumberToPair(int pairNumber,
            MajorColor expectedMajor,
            MinorColor expectedMinor)
        {
            ColorPair colorPair = colorPair.GetColorFromPairNumber(pairNumber);
            System.out.println("Got pair " + colorPair.ToString());
            assert(colorPair.getMajor() == expectedMajor);
            assert(colorPair.getMinor() == expectedMinor);
        }
    
    public void testPairToNumber(
            MajorColor major,
            MinorColor minor,
            int expectedPairNumber)
        {
            int pairNumber = colorPair.GetPairNumberFromColor(major, minor);
            System.out.println("Got pair number " + pairNumber);
            assert(pairNumber == expectedPairNumber);
        }

}
