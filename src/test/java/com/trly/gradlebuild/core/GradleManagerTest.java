package com.trly.gradlebuild.core;

import org.junit.jupiter.api.Test;
import java.math.BigInteger;

import static org.assertj.core.api.Assertions.assertThat;

public class GradleManagerTest {
    @Test
    void shouldAdd() {
        var manager = new GradleManager();
        var sum = manager.add(BigInteger.ONE, BigInteger.ONE);
        assertThat(sum).isEqualTo(BigInteger.TWO);
        
    }

    @Test
    void shouldSubtract() {
        var manager = new GradleManager();
        var sum = manager.subtract(BigInteger.TWO, BigInteger.ONE);
        assertThat(sum).isEqualTo(BigInteger.ONE);

    }
}