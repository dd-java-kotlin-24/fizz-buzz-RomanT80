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
package edu.cnm.deepdive.fizzbuzz

private const val DEFAULT_UPPER_BOUND: Int = 100

/**
 * Prints the values from 1 to a specifiable upper bound (inclusive), replacing every value that's
 * evenly divisible by 3 but not by 5 with an implementation-determined _fizz_ string (e.g.,
 * "Fizz", "fizz", etc.); every value evenly divisible by 5 but not by 3 with a _buzz_ string; and
 * every value evenly divisible by both 3 and 5 with a _fizz-buzz_ string.
 *
 * The upper bound is taken from the first command-line argument; if no argument is provided,
 * [DEFAULT_UPPER_BOUND] is used. If an argument is provided, but cannot be parsed as an [Int],
 * [IllegalArgumentException] is thrown; the same type of exception is thrown if the command-line
 * argument can be parsed as an [Int], but the resulting value is less than 1.
 *
 * This function does not perform the fizz-buzz evaluations directly; neither does it construct the
 * string representations directly: an instance of an implementation of
 * [edu.cnm.deepdive.fizzbuzz.service.FizzBuzzEvaluator] is used for the former, while an instance
 * of a [edu.cnm.deepdive.fizzbuzz.view.FizzBuzzView] implementation is used for the latter.
 *
 * @throws IllegalArgumentException if a command-line argument is provided, but the first such
 * argument cannot be parsed as an [Int], or specifies a value less than 1.
 */
fun main(args: Array<String>) {
    TODO("Implement as described in the KDoc comments.")
}
