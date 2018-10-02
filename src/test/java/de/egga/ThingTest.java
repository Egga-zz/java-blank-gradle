package de.egga;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ThingTest {

    @Test
    void it_should_call_for_action() {
        Thing thing = new Thing();
        String value = thing.callForAction();
        assertThat(value).isEqualTo("Done.");
    }
}
