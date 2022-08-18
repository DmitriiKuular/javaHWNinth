package ru.netology.radio;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void shouldCreate(){
        Radio radio = new Radio();
    }

    @Test
    public void shouldAddInConstructor(){
        Radio radio = new Radio(0, 80, 0, 100, 0, 0);
    }

    @Test
    public void shouldShowFirstStation() {
        Radio radio = new Radio(0, 80, 0, 100, 0, 0);
        assertEquals(0, radio.getFirstStation());
    }

    @Test
    public void shouldShowLastStation() {
        Radio radio = new Radio(0, 80, 0, 100, 0, 0);
        assertEquals(80, radio.getLastStation());
    }

    @Test
    public void shouldSetMaxVolume() {
        Radio radio = new Radio();
        radio.setMaxVolume(55);
        int expected = 55;
        int actual = radio.getMaxVolume();
        assertEquals(expected, actual);
    }
}
