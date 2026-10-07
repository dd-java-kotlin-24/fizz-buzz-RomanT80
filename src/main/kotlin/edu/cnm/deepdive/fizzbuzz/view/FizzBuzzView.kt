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
package edu.cnm.deepdive.fizzbuzz.view

/**
 * Constructs string representations of fizz-buzz evaluation results.
 *
 * This generic interface uses `T` as the representation type of the four possible evaluation
 * outcomes: _fizz_, _buzz_, _fizz-buzz_, or neither. The type must correspond to the result type
 * returned by the [edu.cnm.deepdive.fizzbuzz.service.FizzBuzzEvaluator.evaluate] implementation
 * used.
 *
 * Implementations determine the exact text used for each outcome. The caller is responsible for
 * presenting the returned string.
 */
@FunctionalInterface
interface FizzBuzzView<T> {

    /**
     * Constructs and returns a string representation of [value] based on [evaluation].
     *
     * The [evaluation] argument is assumed to be the result returned by an implementation of the
     * [edu.cnm.deepdive.fizzbuzz.service.FizzBuzzEvaluator.evaluate] function, with [value] passed
     * as an argument.
     *
     * If [evaluation] represents neither _fizz_ nor _buzz_, a string representation of [value] is
     * returned. Otherwise, the returned string contains the implementation's _fizz_, _buzz_, or
     * _fizz-buzz_ text, based on [evaluation].
     *
     * @param value [Int] value.
     * @param evaluation result previously returned by an implementation of
     * [edu.cnm.deepdive.fizzbuzz.service.FizzBuzzEvaluator.evaluate][FizzBuzzEvaluator.evaluate(value)]
     *
     * @return the string representation determined by [value] and [evaluation].
     */
    fun render(value: Int, evaluation: T): String

}
