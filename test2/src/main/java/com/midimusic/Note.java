package com.midimusic;

/**
 *  音符
 */
public enum Note {
    C_4(48),
    C_SHARP_4(49),
    D_4(50),
    D_SHARP_4(51),
    E_4(52),
    F_4(53),
    F_SHARP_4(54),
    G_4(55),
    G_SHARP_4(56),
    A_4(57),
    A_SHARP_4(58),
    B_4(59),
    C_5(60),
    C_SHARP_5(61),
    D_5(62),
    D_SHARP_5(63),
    E_5(64),
    F_5(65),
    F_SHARP_5(66),
    G_5(67),
    G_SHARP_5(68),
    A_5(69),
    A_SHARP_5(70),
    B_5(71),
    C_6(72),
    C_SHARP_6(73),
    D_6(74),
    D_SHARP_6(75),
    E_6(76),
    F_6(77),
    F_SHARP_6(78),
    G_6(79),
    G_SHARP_6(80),
    A_6(81),
    A_SHARP_6(82),
    B_6(83);
    private final int value;
    Note(int value) {
        this.value = value;
    }
    public int getValue() {
        return value;
    }
}
