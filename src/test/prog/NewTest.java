package test.prog;

import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Sequencer;

public class NewTest {

    public void play() {
        try {
            Sequencer sequencer = MidiSystem.getSequencer();
            System.out.println("Done");
        } catch (MidiUnavailableException ex){
            System.out.println("None");
        }
    }
}