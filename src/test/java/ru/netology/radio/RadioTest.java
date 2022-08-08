package ru.netology.radio;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class RadioTest {


    @ParameterizedTest //Проверка информции о номере текущей радиостанции
    @CsvFileSource(files = "src/test/resources/showRadioStation.csv")
    public void shouldShowCurrentStation(int currentStation, int expected) {
        Radio radio = new Radio();
        radio.currentStation = currentStation;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @ParameterizedTest //Проверка функции выставления номера радиостанции
    @CsvFileSource(files = "src/test/resources/setRadioStation.csv")
    public void shouldSetStation(int currentStation, int expected) {
        Radio radio = new Radio();
        radio.setCurrentStation(currentStation);
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @ParameterizedTest  //Проверка кнопки переключения на следующую станцию
    @CsvFileSource(files = "src/test/resources/switchNextStation.csv")
    public void shouldSwitchNextStation(int currentStation, int expected) {
        Radio radio = new Radio();
        radio.setCurrentStation(currentStation);
        int actual = radio.switchNextStation();
        assertEquals(expected, actual);
    }

    @ParameterizedTest  //проверка кнопки переключения на предыдущую станцию
    @CsvFileSource(files = "src/test/resources/switchPrevStation.csv")
    public void shouldSwitchPrevStation(int currentStation, int expected) {
        Radio radio = new Radio();
        radio.setCurrentStation(currentStation);
        int actual = radio.switchPrevStation();
        assertEquals(expected, actual);
    }

    @ParameterizedTest  //Проверка информции о громкости звука
    @CsvFileSource(files = "src/test/resources/showVolume.csv")
    public void shouldShowCurrentVolume(int currentVolume, int expected) {
        Radio radio = new Radio();
        radio.currentVolume = currentVolume;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @ParameterizedTest  //Проверка кнопки увеличения звука
    @CsvFileSource(files = "src/test/resources/increaseVolume.csv")
    public void shouldIncreaseVolume(int currentVolume, int expected) {
        Radio radio = new Radio();
        radio.currentVolume = currentVolume;
        int actual = radio.increaseVolume();
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/reduceVolume.csv")
    public void shouldReduceVolume(int currentVolume, int expected) {
        Radio radio = new Radio();
        radio.currentVolume = currentVolume;
        int actual = radio.reduceVolume();
        assertEquals(expected, actual);
    }
}
