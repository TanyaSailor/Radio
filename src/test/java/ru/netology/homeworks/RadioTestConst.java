package ru.netology.homeworks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTestConst {
    @Test
    public void shouldSetStation() {
        Radio radio = new Radio(25);

        radio.setCurrentStation(9);

        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetStationUnderMax() {
        Radio radio = new Radio(25);

        radio.setCurrentStation(23);

        int expected = 23;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMaxStation() {
        Radio radio = new Radio(25);

        radio.setCurrentStation(24);

        int expected = 24;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void notShouldSetMaxStationEqualRangeStation() {
        Radio radio = new Radio(25);

        radio.setCurrentStation(25);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetMinStation() {
        Radio radio = new Radio(25);

        radio.setCurrentStation(0);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void notShouldSetStationUnderMin() {
        Radio radio = new Radio(25);

        radio.setCurrentStation(-1);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationAboveMin() {
        Radio radio = new Radio(25);

        radio.setCurrentStation(1);

        int expected = 1;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextStation() {
        Radio radio = new Radio(25);

        radio.setCurrentStation(18);

        radio.next();

        int expected = 19;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationNextAfterMin() {
        Radio radio = new Radio(25);

        radio.setCurrentStation(0);

        radio.next();

        int expected = 1;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextMaxStation() {
        Radio radio = new Radio(25);

        radio.setCurrentStation(23);

        radio.next();

        int expected = 24;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void notShouldSetNextStationAboveMax() {
        Radio radio = new Radio(25);

        radio.setCurrentStation(24);

        radio.next();

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevStation() {
        Radio radio = new Radio(13);

        radio.setCurrentStation(6);

        radio.prev();

        int expected = 5;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void prevStationMinLimit() {
        Radio radio = new Radio(13);

        radio.setCurrentStation(0);

        radio.prev();

        int expected = 12;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStationAboveMin() {
        Radio radio = new Radio(13);

        radio.setCurrentStation(1);

        radio.prev();

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStationMaxLimit() {
        Radio radio = new Radio(13);

        radio.setCurrentStation(12);

        radio.prev();

        int expected = 11;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevStationUnderMax() {
        Radio radio = new Radio(13);

        radio.setCurrentStation(11);

        radio.prev();

        int expected = 10;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
}
