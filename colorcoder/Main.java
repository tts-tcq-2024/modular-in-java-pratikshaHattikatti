package colourCode;


public class Main {
    public static void main(String[] args) {
    	ColorPair colorPair = new ColorPair();
    	colorPair.testNumberToPair(4, MajorColor.WHITE, MinorColor.BROWN);
    	colorPair.testNumberToPair(5, MajorColor.WHITE, MinorColor.SLATE);
    
    	colorPair.testPairToNumber(MajorColor.BLACK, MinorColor.ORANGE, 12);
    	colorPair.testPairToNumber(MajorColor.VIOLET, MinorColor.SLATE, 25);
    }
}
