package ru.netology.radio;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class Radio {

    private int firstStation;
    private int lastStation;
    private int minVolume;
    private int maxVolume;
    private int currentStation;
    private int currentVolume;

}
