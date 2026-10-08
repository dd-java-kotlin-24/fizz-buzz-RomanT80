package edu.cnm.deepdive.fizzbuzz.service

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ValueSource
import kotlin.collections.setOf
import kotlin.test.assertFailsWith

class ToSetEvaluatorTest {
    @ParameterizedTest
    @ValueSource(ints = [-1, -3,-5, -15, Int.MIN_VALUE])
    fun evaluate(input: Int) {
        val evaluator = ToSetEvaluator()
        assertFailsWith<IllegalArgumentException> {evaluator.evaluate(input)}
    }

    @ParameterizedTest
    @ValueSource(ints = [3, 6, 9, 33, Int.MAX_VALUE -1 ])
    fun `evaluate returns set(Fizz) for multiple of 3`(input: Int) {
        val evaluator = ToSetEvaluator()
        assertEquals(setOf(FizzBuzz.FIZZ), evaluator.evaluate(input))

    }
    @ParameterizedTest
    @ValueSource(ints = [5, 10, 25, 50, Int.MAX_VALUE -2 ])
    fun `evaluate returns set(Buzz) for multiple of 5`(input: Int) {
        val evaluator = ToSetEvaluator()
        assertEquals(setOf(FizzBuzz.BUZZ), evaluator.evaluate(input))
    }
    @ParameterizedTest
    @ValueSource(ints = [15, 30, 45, 60, Int.MAX_VALUE -7 ])
    fun `evaluate returns set(FizzBuzz) for multiple of 15`(input: Int) {
        val evaluator = ToSetEvaluator()
        assertEquals(setOf(FizzBuzz.FIZZ, FizzBuzz.BUZZ), evaluator.evaluate(input))
    }
    @ParameterizedTest
    @ValueSource(ints = [1, 2, 4, 7, 8, 11, 13, 14, Int.MAX_VALUE ])
    fun `evaluate returns empty set for non-multiple of 3 or 5`(input: Int) {
        val evaluator = ToSetEvaluator()
        assertEquals(emptySet<FizzBuzz>( ), evaluator.evaluate(input))    }
}