package geometry;
import geometrytests.PositionTests;
import geometrytests.SegmentTests;

public class Test{
    public static void main(String[] argc){
        boolean ok = true;
        PositionTests positionTester = new PositionTests();
        ok = ok && positionTester.testGetX();
        ok = ok && positionTester.testGetY();
        ok = ok && positionTester.testSymmetricX();
        ok = ok && positionTester.testTranslate();
        SegmentTests segmentTester = new SegmentTests();
        ok = ok && segmentTester.testLength();
        System.out.println(ok ? "All tests OK" : "At least one test KO");
    }
}
