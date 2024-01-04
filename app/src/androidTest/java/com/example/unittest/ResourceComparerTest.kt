package com.example.unittest

import android.content.Context
import androidx.test.core.app.ApplicationProvider
import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Before
import org.junit.Test

class ResourceComparerTest{

    private lateinit var resourceComparer : ResourceComparer
    @Before
    fun setUp(){
         resourceComparer = ResourceComparer()
    }
    @Test
    fun stringResourceSameAsGivenString_returnsTrue(){
        val context = ApplicationProvider.getApplicationContext<Context>()
        val result = resourceComparer.isEqual(context,R.string.app_name, "UnitTest")
        assertTrue(result)
    }
    @Test
    fun stringResourceDifferentAsGivenString_returnsFalse(){
        val context = ApplicationProvider.getApplicationContext<Context>()
        val result = resourceComparer.isEqual(context,R.string.app_name, "Hello")
        assertFalse(result)
    }

}

/*
explanation on annotation, instance
to run this, it requires an emulator because it relies on the context object
here write test cases
get a context or ref object to use on
rely on class need instance from. have a singleton class(regutilclass) before need not an instance
but here, have class resource comparer need an instance
how to get context object from android dir for test cases
access this  resourcecomparer in all of cases, but it is bad practice, they lead to boilerplate code
this is a bad practice as all the test are required to run independently.
no, they depend on one instance which is resourceComparer
there are two ways, you can initialize the resource comparer in each case, but by adding lateinit
ie. first:  private lateinit val resourceComparer = ResourceComparer() and adding
resourceComparer = ResourceComparer() inside the test cases
second way use this private val resourceComparer = ResourceComparer()
this is the actual test case, must always be annotated
in android, no use of backticks ''
describe what test case will test and what we expect it to return
expect actual function tested to return true
if not use backtick naming
official naming convention in android testing
get reference to context object that is how we get our context object in android test directory
call the function
test the isEqual function
this is the test case, it is annotated with @Test
@Before annotation means, the code inside will be executed before run of the test case
will initialize this object (resourceComparer = ResourceComparer())
@After is, @After fun teardown(){destroy the object but, here not amust as garbage collector will}
in database and when using vm it must be implemented*/
