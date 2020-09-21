import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleClassifierTest {

    @Test
    @DisplayName("case 2-2-2")
    void isTriangle2_2_2() {
        int a = 2;
        int b =2;
        int c=2;
        String resultTest = "Equilateral Triangle";
        String result = TriangleClassifier.getTriangleClassifier(a,b,c);
        assertEquals(resultTest, result);
    }
    @Test
    @DisplayName("case 2-2-3")
    void isTriangle2_2_3() {
        int a = 2;
        int b =2;
        int c=3;
        String resultTest = "Isosceles Triangle";
        String result = TriangleClassifier.getTriangleClassifier(a,b,c);
        assertEquals(resultTest, result);
    }
    @Test
    @DisplayName("case 3-4-5")
    void isTriangle3_4_5() {
        int a = 3;
        int b =4;
        int c=5;
        String resultTest = "Often Triangle";
        String result = TriangleClassifier.getTriangleClassifier(a,b,c);
        assertEquals(resultTest, result);
    }
    @Test
    @DisplayName("case 8-2-3")
    void isTriangle8_2_3() {
        int a = 8;
        int b = 2;
        int c = 3;
        String resultTest = "Not a Triangle";
        String result = TriangleClassifier.getTriangleClassifier(a,b,c);
        assertEquals(resultTest, result);
    }
    @Test
    @DisplayName("case -1-2-1")
    void isTriangle_1_2_1() {
        int a = -1;
        int b = 2;
        int c = 1;
        String resultTest = "Not a Triangle";
        String result = TriangleClassifier.getTriangleClassifier(a,b,c);
        assertEquals(resultTest, result);
    }
    @Test
    @DisplayName("case 0-1-1")
    void isTriangle0_1_1() {
        int a = 0;
        int b = 1;
        int c = 1;
        String resultTest = "Not a Triangle";
        String result = TriangleClassifier.getTriangleClassifier(a,b,c);
        assertEquals(resultTest, result);
    }
}