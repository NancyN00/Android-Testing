package com.example.unittest

import com.google.common.truth.Truth.assertThat
import org.junit.Test

class RegistrationUtilTest {
    @Test
    fun `empty username returns false`() {
        val result = RegistrationUtil.validateRegistrationInput(
            username = "",
            "123",
            "123"
        )

        assertThat(result).isFalse()

    }

    @Test
    fun `valid username and correctly repeated password returns true`(){
        val result = RegistrationUtil.validateRegistrationInput(
            username = "nancy",
            "123",
            "123"
        )

        assertThat(result).isTrue()

    }

    @Test
    fun `username already exists returns false`(){
        val result = RegistrationUtil.validateRegistrationInput(
            username = "Carl",
            "123",
            "123"
        )

        assertThat(result).isFalse()

    }

    @Test
    fun `password empty returns false`(){
        val result = RegistrationUtil.validateRegistrationInput(
            username = "Carl",
            "",
            ""
        )

        assertThat(result).isFalse()

    }

    @Test
    fun `password was repeated incorrectly returns false`(){
        val result = RegistrationUtil.validateRegistrationInput(
            username = "Carl",
            "123",
            "121"
        )

        assertThat(result).isFalse()
    }

    @Test
    fun `password contains less than two digits returns false`(){
        val result = RegistrationUtil.validateRegistrationInput(
            username = "Carl",
            "1webj",
            "1web"
        )

        assertThat(result).isFalse()

    }
}


/*    use of backticks ' '
    jvm will call the function for us
     annotate with @Test
      to have access to the main class RegistrationUtil*/

/* use the result to make an assertion to say it has a specific value
    use not of jvm assertThat because we have the truth library from google
    if isTrue it will fail */