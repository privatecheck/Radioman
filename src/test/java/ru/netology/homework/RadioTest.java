package ru.netology.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {

    @Test
    void changeVolume() {
        Radio volume = new Radio();
        volume.setCurrentVolume(9);

        volume.increaseVolume();
        volume.decreaseVolume();

        int actual = volume.getCurrentVolume();
        int expected = 9;

        assertEquals(actual, expected);
    }

    void changeStation() {
        Radio station = new Radio();
        station.setCurrentStation(5);

        station.nextStation();
        station.prevStation();

        int actual = station.getCurrentStation();
        int expected = 5;

        assertEquals(actual, expected);
    }

}