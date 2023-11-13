package com.example

import org.kodein.mock.Mock
import org.kodein.mock.tests.TestsWithMocks
import kotlin.test.Test

class UnitTest : TestsWithMocks() {

    override fun setUpMocks() = injectMocks(mocker)

    @Mock
    lateinit var testClass: TestClass

    @Test
    fun test() {
        println(testClass)
    }
}