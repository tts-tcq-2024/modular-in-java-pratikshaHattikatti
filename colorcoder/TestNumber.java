package colorcoder;

public class TestNumber {
	
    public void testNumberToPair(int pairNumber,
            MajorColor expectedMajor,
            MinorColor expectedMinor)
        {
           
		ColorPair colorPair = ColorPair.GetColorFromPairNumber(pairNumber);
            System.out.println("Got pair " + colorPair.ToString());
            assert(colorPair.getMajor() == expectedMajor);
            assert(colorPair.getMinor() == expectedMinor);
        }
    
    public void testPairToNumber(
            MajorColor major,
            MinorColor minor,
            int expectedPairNumber)
        {
            int pairNumber = ColorPair.GetPairNumberFromColor(major, minor);
            System.out.println("Got pair number " + pairNumber);
            assert(pairNumber == expectedPairNumber);
        }

}
