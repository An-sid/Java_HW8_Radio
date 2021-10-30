package ru.netology.radio;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    Radio r = new Radio();

// Тест Требований к работе с радиостанциями:

    @Test
    void setCurStationOnAvrgValue() {
        r.setCurrentStation(5);
        int expected = 5;
        int actual = r.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void setPrevStationInRange() {
        r.setCurrentStation(5);
        r.setPreviousStation();
        int expected = 4;
        int actual = r.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void setNextStationInRange() {
        r.setCurrentStation(5);
        r.setNextStation();
        int expected = 6;
        int actual = r.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void setCurStationOnMinValue() {
        r.setCurrentStation(0);
        int expected = 0;
        int actual = r.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void setPrevStationOutOfRange() {
        r.setCurrentStation(0);
        r.setPreviousStation();
        int expected = 9;
        int actual = r.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void setCurStationOnMaxValue() {
        r.setCurrentStation(9);
        int expected = 9;
        int actual = r.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void setNextStationOutOfRange() {
        r.setCurrentStation(9);
        r.setNextStation();
        int expected = 0;
        int actual = r.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void setCurrentStationOutOfScope() {
        r.setCurrentStation(11);
        int expected = 0;
        int actual = r.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void setNotValidCurrentStation() {
        r.setCurrentStation(-1);
        int expected = 0;
        int actual = r.getCurrentStation();
        assertEquals(expected, actual);
    }
// Тест Требований к работе с уровнем громкости звука:

    @Test
    void increaseVolumeOnMaxValue() {
        r.setVolume(9);
        r.increaseVolume();
        int expected = 10;
        int actual = r.getVolume();
        assertEquals(expected, actual);
    }

    @Test
    void increaseVolumeOverMaxValue() {
        r.setVolume(10);
        r.increaseVolume();
        int expected = 10;
        int actual = r.getVolume();
        assertEquals(expected, actual);
    }

    @Test
    void decreaseVolumeOnMinValue() {
        r.setVolume(1);
        r.decreaseVolume();
        int expected = 0;
        int actual = r.getVolume();
        assertEquals(expected, actual);
    }

    @Test
    void decreaseVolumeUnderMinValue() {
        r.setVolume(0);
        r.decreaseVolume();
        int expected = 0;
        int actual = r.getVolume();
        assertEquals(expected, actual);
    }
}