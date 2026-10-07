/*
 *  Copyright 2026 CNM Ingenuity, Inc.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package edu.cnm.deepdive.fizzbuzz.service

/**
 * Declares the [FizzBuzzEvaluator.evaluate] method for evaluating an `Int` parameter value and
 * returning a result indicating whether that value is a _fizz_ (evenly divisible by 3 but not by
 * 5), a _buzz_ (evenly divisible by 5 but not by 3), a _fizz-buzz_ (evenly divisible by both 3 and
 * 5), or none of the above.
 *
 * This is a generic interface, where the type parameter `T` denotes the type of value returned by
 * the [FizzBuzzEvaluator.evaluate] method. Concrete implementations are responsible for
 * implementing (and documenting) how the four possible outcomes will be represented by values of
 * the `T` type. Similarly, if a concrete implementation does not accept the full range of `Int`
 * values (e.g., if negative values are not supported), [FizzBuzzEvaluator.evaluate] should throw
 * [IllegalArgumentException] for values outside the accepted range, and that behavior should be
 * documented appropriately.
 */
@FunctionalInterface
interface FizzBuzzEvaluator<T> {

    /**
     * Computes and returns a value indicating (using an implementation-defined representation
     * scheme) whether [input] is evenly divisible by 3 but not by 5 (i.e., _fizz_), evenly
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
     * @throws IllegalArgumentException if an implementation constrains the supported range for
     * [input], and a value outside those constraints is passed.
     */
    fun evaluate(input: Int): T

}