package com.example.unittest

import android.content.Context
import androidx.test.core.app.ApplicationProvider


import org.junit.Assert.assertThat
import org.junit.Test

class ResourceComparerTest{
    
    //get a context or ref object
    //rely on class need instance from
    //how to get context object from android dir for test cases
    
     private val resourceComparer = ResourceComparer()
    
    @Test
    fun stringResourceSameAsGivenString_returnsTrue(){
        val context = ApplicationProvider.getApplicationContext<Context>()
        val result = resourceComparer.isEqual(context,R.string.app_name, "UnitTest")
      assertThat(result).isTrue()
      
    }
    
}