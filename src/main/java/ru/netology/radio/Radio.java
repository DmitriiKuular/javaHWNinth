package ru.netology.radio;

public class Radio {

    public int currentStation;

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < 0) {
            return;
        }
        if (newCurrentStation > 9) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public int switchNextStation() {
        if (currentStation < 9) {
            currentStation = currentStation + 1;
        } else {
            currentStation = 0;
        }
        return currentStation;
    }

    public int switchPrevStation() {
        if (currentStation > 0) {
            currentStation = currentStation - 1;
        } else {
            currentStation = 9;
        }
        return currentStation;
    }

    public int currentVolume;
    public int getCurrentVolume() {
        return currentVolume;
    }

    public int increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        } else {
            currentVolume = 10;
        }
        return currentVolume;
    }

    public int reduceVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        } else {currentVolume = 0;}
        return currentVolume;
    }
}
