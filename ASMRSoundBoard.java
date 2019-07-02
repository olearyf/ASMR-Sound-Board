import javax.swing.*;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import java.io.File;
import java.net.*;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class ASMRSoundBoard extends JFrame implements ActionListener{
	
    JPanel main;
    BorderLayout bl;
    JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12;
    JPanel pl;
    
    ASMRSoundBoard(){
		
        main = new JPanel();
        bl = new BorderLayout();
        main.setLayout(bl);
        
        b1 = new JButton("Avalanche");
        b2 = new JButton("Fireplace");
        b3 = new JButton("Handcuffs");
        b4 = new JButton("Ice Cubes");
        b5 = new JButton("Marbles");
        b6 = new JButton("Photocopying Machine");
        b7 = new JButton("Poker Chips");
        b8 = new JButton("Projector");
        b9 = new JButton("Shoes");
        b10 = new JButton("Slot Machine");
        b11 = new JButton("Typewriter");
        b12 = new JButton("Water Drops");
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b10.addActionListener(this);
        b11.addActionListener(this);
        b12.addActionListener(this);

        pl = new JPanel ();
        GridLayout gl = new GridLayout(4,3);
        pl.setLayout(gl);

        pl.add(b1);
        pl.add(b2);
        pl.add(b3);
        pl.add(b4);
        pl.add(b5);
        pl.add(b6);
        pl.add(b7);
        pl.add(b8);
        pl.add(b9);
        pl.add(b10);
        pl.add(b11);
        pl.add(b12);

        main.add("Center",pl);
        
        JFrame frame = new JFrame("ASMR Sound Board");
        frame.setContentPane(main);
        frame.pack();
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int h = (int)screenSize.getHeight();
        int w = (int)screenSize.getWidth();
        frame.setLocation(w/2-250, h/2-250);
        frame.setResizable(false);
        frame.setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e){
        String s = e.getActionCommand();

        if(s.equals("Avalanche")){
            playClip("filepath.wav");
        }
        else if(s.equals("Fireplace")){
			playClip("filepath.wav");
        }
        else if(s.equals("Handcuffs")){
			playClip("filepath.wav");
        }
        else if(s.equals("Ice Cubes")){
			playClip("filepath.wav");
        }
        else if(s.equals("Marbles")){
			playClip("filepath.wav");
        }
        else if(s.equals("Photocopying Machine")){
			playClip("filepath.wav");
        }
        else if(s.equals("Poker Chips")){
			playClip("filepath.wav");
        }
        else if(s.equals("Projector")){
			playClip("filepath.wav");
        }
        else if(s.equals("Shoes")){
			playClip("filepath.wav");
        }
        else if(s.equals("Slot Machine")){
			playClip("filepath.wav");
        }
        else if(s.equals("Typewriter")){
			playClip("filepath.wav");
        }
        else if(s.equals("Water Drops")){
			playClip("filepath.wav");
        }
	}
	
	public static void playClip(String fn)
	{
		try{
			Clip c = AudioSystem.getClip();
			c.open(AudioSystem.getAudioInputStream(new File(fn)));
			c.start();
		}
		catch (Exception exc){
			exc.printStackTrace(System.out);
		}
	}

    public static void main(String[] args) {
        ASMRSoundBoard sound = new ASMRSoundBoard();
    }
}

