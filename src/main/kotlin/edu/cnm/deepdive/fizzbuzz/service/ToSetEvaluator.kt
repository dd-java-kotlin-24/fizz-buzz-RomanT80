package edu.cnm.deepdive.fizzbuzz.service

class ToSetEvaluator : FizzBuzzEvaluator<Set<FizzBuzz>> {
    /**
     * Computes and returns a [Set][Set<FizzBuzz>] value indicating whether [input] is evenly
     * divisible by 3 but not by 5 (i.e., [FizzBuzz.FIZZ]), evenly
     * divisible by 5 but not by 3 (_buzz_), evenly divisible by both 3 and 5 (_fizz-buzz_), or
     * evenly divisible by neither 3 nor 5.
     *
     * It is up to an implementation to determine how the four possible outcomes should be
     * represented, and whether the full range of [Int] values should be accepted for the [input]
     * parameter. Implementors are encouraged to allow [input] to take either _any_ [Int] value, any
     * non-negative [Int] value, or any positive [Int] value; in any event, passing a value outside
     * the valid range must be indicated by the implementation throwing an
     * [IllegalArgumentException].
     *
     * @param input [Int] value to be evaluated, as constrained by the implementation.
     * @return evaluation result.
     * @throws IllegalArgumentException if 'input < 0'.
     * [input], and a value outside those constraints is passed.
     */
    override fun evaluate(input: Int): Set <FizzBuzz> {
        require(input >= 0) { "Input must be non-negative." }
        TODO("Not yet implemented")
    }

}
enum class FizzBuzz{
    FIZZ,
    BUZZ,
    FIZZ_BUZZ,
    NEITHER
}