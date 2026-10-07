package edu.cnm.deepdive.fizzbuzz.service

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ValueSource
import kotlin.test.assertFailsWith

class ToSetEvaluatorTest {
    @ParameterizedTest
    @ValueSource(ints = [-1, -3,-5, -15, Int.MIN_VALUE])
    fun evaluate(input: Int) {
        val evaluator = ToSetEvaluator()
        assertFailsWith<IllegalArgumentException> {evaluator.evaluate(input)}
    }

}