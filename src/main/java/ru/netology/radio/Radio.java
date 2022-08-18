package ru.netology.radio;

public class Radio {

    private int firstStation = 0;
    private int lastStation = 9;
    private int currentStation = firstStation;

    private int minVolume = 0;
    private int maxVolume = 100;
    private int currentVolume = minVolume;

    public Radio(int Amount) {
        lastStation = currentStation + Amount - 1;
    }

    public int getLastStation() {
        return lastStation;
    }

    public Radio() {}

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < firstStation) {
            return;
        }
        if (newCurrentStation > lastStation) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public int switchNextStation() {
        if (currentStation < lastStation) {
            currentStation ++;
        } else {
            currentStation = firstStation;
        }
        return currentStation;
    }

    public int switchPrevStation() {
        if (currentStation > firstStation) {
            currentStation --;
        } else {
            currentStation = lastStation;
        }
        return currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < minVolume) {
            return;
        }
        if (newCurrentVolume > maxVolume) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public int increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        } else {
            currentVolume = maxVolume;
        }
        return currentVolume;
    }

    public int reduceVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        } else {currentVolume = minVolume;}
        return currentVolume;
    }
}
