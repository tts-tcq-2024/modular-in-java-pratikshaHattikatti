package colorcoder;
import colourcode.*;

public class Main {

    public static void main(String[] args) {
    	TestNumber testNumber = new TestNumber();
    	testNumber.testNumberToPair(4, MajorColor.WHITE, MinorColor.BROWN);
    	testNumber.testNumberToPair(5, MajorColor.WHITE, MinorColor.SLATE);
    
    	testNumber.testPairToNumber(MajorColor.BLACK, MinorColor.ORANGE, 12);
    	testNumber.testPairToNumber(MajorColor.VIOLET, MinorColor.SLATE, 25);
    }
}
