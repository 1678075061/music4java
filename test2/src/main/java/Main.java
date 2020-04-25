import javax.sound.midi.InvalidMidiDataException;

public class Main {
    public static void main(String[] args) throws InvalidMidiDataException {
        PianoRoll pianoRoll = new PianoRoll(126, 0);
        Note[] lead = {
                //F# F# C# B A
                Note.F_SHARP_5, Note.F_SHARP_5, Note.C_SHARP_6, Note.B_5, Note.A_5,
                //G# G# G# B A G#
                Note.G_SHARP_5, Note.G_SHARP_5, Note.G_SHARP_5, Note.B_5, Note.A_5, Note.G_SHARP_5,
                //F# F# A G# A G# A
                Note.F_SHARP_5, Note.F_SHARP_5, Note.A_6, Note.G_SHARP_6, Note.A_6, Note.G_SHARP_6, Note.A_6,
                //F# F# A G# A G# A
                Note.F_SHARP_5, Note.F_SHARP_5, Note.A_6, Note.G_SHARP_6, Note.A_6, Note.G_SHARP_6, Note.A_6,

                //F# F# C# B A
                Note.F_SHARP_5, Note.F_SHARP_5, Note.C_SHARP_6, Note.B_5, Note.A_5,
                //G# G# G# B A G#
                Note.G_SHARP_5, Note.G_SHARP_5, Note.G_SHARP_5, Note.B_5, Note.A_5, Note.G_SHARP_5,
                //F# F# A G# A G# A
                Note.F_SHARP_5, Note.F_SHARP_5, Note.A_6, Note.G_SHARP_6, Note.A_6, Note.G_SHARP_6, Note.A_6,
                //F# F# A G# A G# A
                Note.F_SHARP_5, Note.F_SHARP_5, Note.A_6, Note.G_SHARP_6, Note.A_6, Note.G_SHARP_6, Note.A_6,

                //F# F# C# B A
                Note.F_SHARP_5, Note.F_SHARP_5, Note.C_SHARP_6, Note.B_5, Note.A_5,
                //G# G# G# B A G#
                Note.G_SHARP_5, Note.G_SHARP_5, Note.G_SHARP_5, Note.B_5, Note.A_5, Note.G_SHARP_5,
                //F# F# A G# A G# A
                Note.F_SHARP_5, Note.F_SHARP_5, Note.A_6, Note.G_SHARP_6, Note.A_6, Note.G_SHARP_6, Note.A_6,
                //F# F# A G# A G# A
                Note.F_SHARP_5, Note.F_SHARP_5, Note.A_6, Note.G_SHARP_6, Note.A_6, Note.G_SHARP_6, Note.A_6,

                //A A A A C# C# C# C#
                Note.A_5, Note.A_5, Note.A_5, Note.A_5, Note.C_SHARP_6, Note.C_SHARP_6, Note.C_SHARP_6, Note.C_SHARP_6,
                //B B B B E E E E
                Note.B_5, Note.B_5, Note.B_5, Note.B_5, Note.E_6, Note.E_6, Note.E_6, Note.E_6,
                //F# F# F# F# F# F# F# F#
                Note.F_SHARP_6, Note.F_SHARP_6, Note.F_SHARP_6, Note.F_SHARP_6, Note.F_SHARP_6, Note.F_SHARP_6, Note.F_SHARP_6, Note.F_SHARP_6,
                //F# F# F# F# B A G# E
                Note.F_SHARP_6, Note.F_SHARP_6, Note.F_SHARP_6, Note.F_SHARP_6, Note.B_5, Note.A_5, Note.G_SHARP_5, Note.E_5
        };
        int leadTicks[]={
                4,
                4,2,2,4,4,
                4,2,2,4,2,2,
                4,2,2,2,2,2,2,
                4,2,2,2,2,2,2,

                4,2,2,4,4,
                4,2,2,4,2,2,
                4,2,2,2,2,2,2,
                4,2,2,2,2,2,2,

                4,2,2,4,4,
                4,2,2,4,2,2,
                4,2,2,2,2,2,2,
                4,2,2,2,2,2,2,

                2,2,2,2,2,2,2,2,
                2,2,2,2,2,2,2,2,
                2,2,2,2,2,2,2,2,
                2,2,2,2,2,2,2,2
        };
        pianoRoll.setNote(lead, 1, 100, leadTicks);

        Note[] chord = {
                //D E F#m
                Note.D_4, Note.F_SHARP_4, Note.A_4,
                Note.E_4, Note.G_SHARP_4, Note.B_4,
                Note.F_SHARP_4, Note.A_4, Note.C_SHARP_5,
                Note.F_SHARP_4, Note.A_4, Note.C_SHARP_5,

                Note.D_4, Note.F_SHARP_4, Note.A_4,
                Note.E_4, Note.G_SHARP_4, Note.B_4,
                Note.F_SHARP_4, Note.A_4, Note.C_SHARP_5,
                Note.F_SHARP_4, Note.A_4, Note.C_SHARP_5,

                Note.D_4, Note.F_SHARP_4, Note.A_4,
                Note.E_4, Note.G_SHARP_4, Note.B_4,
                Note.F_SHARP_4, Note.A_4, Note.C_SHARP_5,
                Note.F_SHARP_4, Note.A_4, Note.C_SHARP_5,

                Note.D_4, Note.F_SHARP_4, Note.A_4,
                Note.E_4, Note.G_SHARP_4, Note.B_4,
                Note.F_SHARP_4, Note.A_4, Note.C_SHARP_5,
                Note.F_SHARP_4, Note.A_4, Note.C_SHARP_5,
        };
        int[] chordTicks = {
                4,
                0,0,16,
                0,0,16,
                0,0,16,
                0,0,16,

                0,0,16,
                0,0,16,
                0,0,16,
                0,0,16,

                0,0,16,
                0,0,16,
                0,0,16,
                0,0,16,

                0,0,16,
                0,0,16,
                0,0,16,
                0,0,16
        };
        pianoRoll.setNote(chord, 2, 50, chordTicks);

        pianoRoll.run();
    }

}
