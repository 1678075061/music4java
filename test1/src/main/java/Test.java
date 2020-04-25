import javax.sound.midi.*;
import java.io.File;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws MidiUnavailableException, InvalidMidiDataException, IOException {
        File soundFile = new File("C:/Users/NianChen/Desktop/spt.mid");
        Sequence sequence = MidiSystem.getSequence(soundFile);
        Sequencer sequencer = MidiSystem.getSequencer();
        sequencer.setSequence(sequence);
        sequencer.open();

        float bpm = sequencer.getTempoInBPM();
        int loopCount = sequencer.getLoopCount();
        System.out.println("歌名："+soundFile.getName());
        System.out.println("bpm："+bpm);
        System.out.println("循环次数："+loopCount);



        Track[] tracks = sequence.getTracks();
        System.out.println("轨道数："+tracks.length);
        MidiMessage message = tracks[0].get(2).getMessage();
        System.out.println(message.getStatus());
        System.out.println(message.getLength());
        System.out.println("=============");

        sequencer.start();



//        for (int i=0;i<tracks.length;i++) {
//            System.out.println("轨道大小："+tracks[i].size());
//            for (int j=0;j<tracks[i].size();j++){
//                MidiMessage message = tracks[i].get(j).getMessage();
//                for (byte b : message.getMessage()) {
//                    System.out.print(" 音高："+b);
//                }
//            }
//        }
    }
}
