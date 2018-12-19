package com.devindi.wallpaper.model.storage

import org.junit.Test
import org.junit.runner.RunWith
import org.koin.test.AutoCloseKoinTest
import org.robolectric.RobolectricTestRunner
import org.junit.Assert.assertEquals

/**
 * author   : Eugene Dudnik
 * date     : 9/15/18
 * e-mail   : esdudnik@gmail.com
 */
@RunWith(RobolectricTestRunner::class)
class KoinErrorTestClass /*: AutoCloseKoinTest()*/ {

    @Test
    fun koinErrorTestOne() {
        val result = true
        assertEquals(result, true)
    }

    @Test
    fun koinErrorTestTwo() {
        val result = false
        assertEquals(result, false)
    }
}
