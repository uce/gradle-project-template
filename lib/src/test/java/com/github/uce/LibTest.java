package com.github.uce;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class LibTest {

  @Test
  public void testA() {
    assertThat("ok").isEqualTo("ok");
  }
}
