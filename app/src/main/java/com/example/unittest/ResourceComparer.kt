package com.example.unittest

import android.content.Context

class ResourceComparer {

    //compare string at resource id which is string, return type is a boolean, whether string of resource id
    //is equal to string passed
    fun isEqual(context: Context, resId: Int, string: String): Boolean{
        return context.getString(resId) == string
    }
}