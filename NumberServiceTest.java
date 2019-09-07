package lv.javaguru.lessons.lesson3;

public class NumberServiceTest {

    public static void main(String[] args) {
        NumberService service = new NumberService();
        int actualResult = service.sumInRange(1, 3);
        int expected = 6;

        if (actualResult == expected) {
            System.out.println("URA! Success!");
        } else {
            System.out.println("T_T Fail!!!");
        }
        int actualEvenNumberResult = service.getEvenNumberCount(1, 10);
        int expectedEvenNumberCount = 5;
        if (actualEvenNumberResult == expectedEvenNumberCount) {
            System.out.println("URA! Success!");
        } else {
            System.out.println("T_T Fail!!!");
        }
    }
}
