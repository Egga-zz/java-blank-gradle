package de.egga.mock;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class ApplicationTest {

    @Mock
    MessageQueue messageQueue;

    @InjectMocks
    Application application;

    @Test
    void it_should_collaborate() {
        when(messageQueue.receive()).thenReturn("Fetched value");
        String fetched = application.receive();
        assertThat(fetched).isEqualTo("Fetched value");
    }

    @Test
    void it_should_verify() {
        application.send("some value");
        verify(messageQueue).send("some value");
    }
}
