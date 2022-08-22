package ru.netology.radio;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

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

    @Test
    public void shouldSetCurrentStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);
        int expected = 0;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @ParameterizedTest //Проверка информции о номере текущей радиостанции
    @CsvFileSource(files = "src/test/resources/showRadioStation.csv")
    public void shouldShowCurrentStation(int currentStation, int expected) {
        Radio radio = new Radio(0, 9, 0, 100, 0, 0);
        radio.setCurrentStation(currentStation);
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @ParameterizedTest //Проверка функции выставления номера радиостанции
    @CsvFileSource(files = "src/test/resources/setRadioStation.csv")
    public void shouldSetStation(int currentStation, int expected) {
        Radio radio = new Radio(0, 9, 0, 100, 0, 0);
        radio.setCurrentStation(currentStation);
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @ParameterizedTest  //Проверка кнопки переключения на следующую станцию
    @CsvFileSource(files = "src/test/resources/switchNextStation.csv")
    public void shouldSwitchNextStation(int currentStation, int expected) {
        Radio radio = new Radio(0, 9, 0, 100, 0, 0);
        radio.setCurrentStation(currentStation);
        int actual = radio.switchNextStation();
        assertEquals(expected, actual);
    }

    @ParameterizedTest  //проверка кнопки переключения на предыдущую станцию
    @CsvFileSource(files = "src/test/resources/switchPrevStation.csv")
    public void shouldSwitchPrevStation(int currentStation, int expected) {
        Radio radio = new Radio(0, 9, 0, 100, 0, 0);
        radio.setCurrentStation(currentStation);
        int actual = radio.switchPrevStation();
        assertEquals(expected, actual);
    }

    @ParameterizedTest  //Проверка информции о громкости звука (до 100)
    @CsvFileSource(files = "src/test/resources/showVolume.csv")
    public void shouldShowCurrentVolume(int currentVolume, int expected) {
        Radio radio = new Radio(0, 9, 0, 100, 0, 0);
        radio.setCurrentVolume(currentVolume);
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @ParameterizedTest  //Проверка кнопки увеличения звука (до 100)
    @CsvFileSource(files = "src/test/resources/increaseVolume.csv")
    public void shouldIncreaseVolume(int currentVolume, int expected) {
        Radio radio = new Radio(0, 9, 0, 100, 0, 0);
        radio.setCurrentVolume(currentVolume);
        int actual = radio.increaseVolume();
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/reduceVolume.csv")
    public void shouldReduceVolume(int currentVolume, int expected) {
        Radio radio = new Radio(0, 9, 0, 100, 0, 0);
        radio.setCurrentVolume(currentVolume);
        int actual = radio.reduceVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetAmountStations() {
        Radio radio = new Radio(40);
        assertEquals(39, radio.getLastStation());
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/switchNextNewStation.csv")
    public void shouldSwitchNextNewStation(int currentStation, int expected){
        Radio radio = new Radio(15);
        radio.setCurrentStation(currentStation);
        int actual = radio.switchNextStation();
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/switchPrevNewStation.csv")
    public void shouldSwitchPrevNewStation(int currentStation, int expected) {
        Radio radio = new Radio(15);
        radio.setCurrentStation(currentStation);
        int actual = radio.switchPrevStation();
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/setNewRadioStation.csv")
    public void shouldSetNewStation(int currentStation, int expected) {
        Radio radio = new Radio(53);
        radio.setCurrentStation(currentStation);
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

}
