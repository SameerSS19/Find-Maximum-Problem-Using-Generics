package com.generics;

import org.junit.Assert;
import org.junit.Test;

public class MaximumCheckTest {

	/* Maximum Integer element at the position 1 */
    @Test
    public void maximumIntegerAtPosition1() {
        Integer maximumInteger = MaximumCheck.maximumInteger(22, 7, 14);
        Assert.assertSame(22, maximumInteger);
    }

    /* Maximum Integer element at the position 2 */
    @Test
    public void maximumIntegerAtPosition2() {
        Integer maximumInteger = MaximumCheck.maximumInteger(14, 22, 7);
        Assert.assertSame(22, maximumInteger);
    }

    /* Maximum Integer element at the position 3 */
    @Test
    public void maximumIntegerAtPosition3() {
        Integer maximumInteger = MaximumCheck.maximumInteger(7, 14, 22);
        Assert.assertSame(22, maximumInteger);
    }
}
