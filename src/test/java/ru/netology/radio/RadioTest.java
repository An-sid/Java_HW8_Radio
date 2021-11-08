package ru.netology.radio;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    Radio r = new Radio();
    Radio rp = new Radio(10,5, 100);
    Radio rp9 = new Radio(10,9,99);

// Тест Требований к работе с радиостанциями:

    @Test
    void setStation() {
        r.setStation(5);
        int expected = 5;
        assertEquals(expected, r.getCurrentStation());
    }
    @Test
    void setStationOutOfScope() {
        r.setStation(11);
        int expected = 0;
        assertEquals(expected, r.getCurrentStation());
    }

    @Test
    void setNotValidStation() {
        r.setStation(-1);
        int expected = 0;
        assertEquals(expected, r.getCurrentStation());
    }

    @Test
    void setPrevStationInRange() {
        //Radio r = new Radio();
        assertEquals(4, rp.previousStation());
    }
    @Test
    void setPrevStationOutOfRange() {
        assertEquals(9, r.previousStation());

    }

    @Test
    void setNextStationInRange() {
        //Radio r = new Radio();
        assertEquals(6, rp.nextStation());
    }

    @Test
    void setNextStationOutOfRange() {
        assertEquals(0, rp9.nextStation());
    }

//// Тест Требований к работе с уровнем громкости звука:

    @Test
    void increaseVolumeOnMaxValue() {
        assertEquals(100, rp9.increaseVolume());
    }

    @Test
    void increaseVolumeOverMaxValue() {
        assertEquals(100, rp.increaseVolume());
}

    @Test
    void decreaseVolumeOnMinValue() {
        Radio temp = new Radio(10, 9, 1);
        assertEquals(0, temp.decreaseVolume());
    }

    @Test
    void decreaseVolumeUnderMinValue() {
        assertEquals(0, r.decreaseVolume());
    }
}