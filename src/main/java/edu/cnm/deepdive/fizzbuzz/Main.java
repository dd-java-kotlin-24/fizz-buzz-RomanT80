package edu.cnm.deepdive.fizzbuzz;

import edu.cnm.deepdive.fizzbuzz.model.FizzBuzz;
import edu.cnm.deepdive.fizzbuzz.service.ToSetEvaluator;
import edu.cnm.deepdive.fizzbuzz.view.FromSetView;
import java.util.Set;

public class Main {

  /**
   * Default upper limit for FizzBuzz count, if none is specified.
   */
  public static final int DEFAULT_UPPER_LIMIT = 100;

  void main(String... args) {
    int upperLimit = DEFAULT_UPPER_LIMIT;
    if (args.length > 0) {
      upperLimit = Integer.parseInt(args[0]);
    }
    ToSetEvaluator evaluator = new ToSetEvaluator();
    FromSetView view = new FromSetView();

    for (int count = 1; count <= upperLimit; count++) {
      Set<FizzBuzz> evaluation = evaluator.evaluate(count);
      String representation = view.render(count, evaluation);
      System.out.println(representation);
    }
  }
}

