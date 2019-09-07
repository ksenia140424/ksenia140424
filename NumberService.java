package lv.javaguru.lessons.lesson3;

public class NumberService {

    public int sumInRange(int firstNumber, int secondNumber) {
        int sum = 0;
        while (firstNumber <= secondNumber) {
            sum = firstNumber + sum;
            System.out.println("First Number = " + firstNumber + "; temp.sum = " + sum);
            firstNumber++;
        }
        return sum;
    }
    public int getEvenNumberCount(int firstNumber, int secondNumber) {
        int countEvenNumber = 0;
        while (firstNumber <= secondNumber) {
            if (firstNumber %2 == 0) {
                countEvenNumber = countEvenNumber + 1;
            System.out.println("First Number = " + firstNumber + "; count number = " + countEvenNumber);
            }
            firstNumber++;
        }
        return countEvenNumber;
    }
}
