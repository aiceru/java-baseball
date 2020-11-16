package baseballgame;

import java.util.List;
import java.util.ArrayList;

public class AnswerGenerator {
  public int[] generate() {
    List<Integer> numberPool = createNumberPool();
    return pickRandomNumbers(numberPool);
  }

  private List<Integer> createNumberPool() {
    List<Integer> pool = new ArrayList<>();
    for (int i = 1; i < 10; i++) {
      pool.add(i);
    }
    return pool;
  }

  private int[] pickRandomNumbers(List<Integer> list) {
    int[] randomArray = new int[GameNumbers.DIGITS];
    for (int i = 0; i < GameNumbers.DIGITS; i++) {
      randomArray[i] = list.remove(getRandomIndex(list));
    }
    return randomArray;
  }

  private int getRandomIndex(List<Integer> list) {
    return ((int) (Math.random() * list.size()));
  }
}