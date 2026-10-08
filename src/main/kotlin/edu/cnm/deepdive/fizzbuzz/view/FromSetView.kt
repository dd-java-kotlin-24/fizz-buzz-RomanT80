package edu.cnm.deepdive.fizzbuzz.view

import edu.cnm.deepdive.fizzbuzz.service.FizzBuzz

class FromSetView : FizzBuzzView<Set<FizzBuzz>> {
    /**
     * Constructs and returns a string representation of [value] based on [evaluation].
     *
     * The [evaluation] argument is a [Set][Set <FizzBuzz>] assumed to be the result returned by an implementation of the
     * [edu.cnm.deepdive.fizzbuzz.service.FizzBuzzEvaluator.evaluate] function, with [value] passed
     * as an argument.
     *
     * If [evaluation] is an empty set, a string representation (using base 10 without digit grouping characters or other delimiters) of [value] is
     * returned. Otherwise, the returned string contains the implementation's _fizz_, _buzz_, or
     * _fizz-buzz_ text, based on [evaluation].
     *
     * @param value [Int] value.
     * @param evaluation [Set] previously returned by an implementation of
     * [edu.cnm.deepdive.fizzbuzz.service.FizzBuzzEvaluator.evaluate][FizzBuzzEvaluator.evaluate(value)]
     *
     * @return the string representation determined by [value] and [evaluation].
     */
    override fun render(value: Int, evaluation: Set<FizzBuzz>): String {
        TODO("Not yet implemented")
    }
}