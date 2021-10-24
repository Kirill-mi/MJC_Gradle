package by.kirill;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class StringUtilsTest {

    @Test
    public void testIsPositiveNumber(){
        Assertions.assertFalse(StringUtils.isPositiveNumber("-3"));
        Assertions.assertFalse(StringUtils.isPositiveNumber("a"));
        Assertions.assertTrue(StringUtils.isPositiveNumber("0"));
        Assertions.assertTrue(StringUtils.isPositiveNumber("1"));}
}