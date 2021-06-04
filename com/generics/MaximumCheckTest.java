package com.generics;

import org.junit.Assert;
import org.junit.Test;

public class MaximumCheckTest {

	/* At The Position 1 Maximum Integer element  */
    @Test
    public void maximumIntegerAtPosition1() {
        Integer maximumInteger = MaximumCheck.maximumInteger(22, 7, 14);
        Assert.assertSame(22, maximumInteger);
    }

    /* At The Position 2 Maximum Integer element */
    @Test
    public void maximumIntegerAtPosition2() {
        Integer maximumInteger = MaximumCheck.maximumInteger(14, 22, 7);
        Assert.assertSame(22, maximumInteger);
    }

    /* At The Position 3 Maximum Integer element */
    @Test
    public void maximumIntegerAtPosition3() {
        Integer maximumInteger = MaximumCheck.maximumInteger(7, 14, 22);
        Assert.assertSame(22, maximumInteger);
    }
    
    /* At The Position 1 Float Integer element */
    @Test
    public void maximumFloatAtPosition1() {
        Float maximumFloat = MaximumCheck.maximumFloat(11.15f, 7.349f, 25.4495f);
        Assert.assertEquals((Float) 25.4495f, maximumFloat);
    }

    /* At The Position 2 Float Integer element*/
    @Test
    public void maximumFloatAtPosition2() {
        Float maximumFloat = MaximumCheck.maximumFloat(21.75f, 32.89f, 7.82f);
        Assert.assertEquals((Float) 32.89f, maximumFloat);
    }

    /* At The Position 3 Float Integer element */
    @Test
    public void maximumFloatAtPosition3() {
        Float maximumFloat = MaximumCheck.maximumFloat(9.46f, 8.0f, 25.25f);
        Assert.assertEquals((Float) 25.25f, maximumFloat);
    }
}
