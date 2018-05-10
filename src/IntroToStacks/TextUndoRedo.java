package IntroToStacks;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TextUndoRedo implements KeyListener {
	JFrame jf = new JFrame();
	JPanel jp = new JPanel();
	JLabel jl = new JLabel();
	Stack<String> undoStack = new Stack<String>();

	public static void main(String[] args) {
		TextUndoRedo tur = new TextUndoRedo();
		tur.textScreen();
	}

	void textScreen() {
		jf.add(jp);
		jp.add(jl);
		jf.addKeyListener(this);
		jf.setVisible(true);
		jf.pack();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		String text = jl.getText();
		if (e.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
			if (text.length() > 0) {
				String pullText = jl.getText();
				String lastChar = pullText.substring(pullText.length() - 1, pullText.length());
				undoStack.add(lastChar);
				pullText = pullText.substring(0, pullText.length() - 1);
				text = pullText;
				jl.setText(text);
			}

		} else if (e.getKeyCode() == KeyEvent.VK_SHIFT) {
			if(undoStack.size()>0) {
			String undoText = undoStack.pop();
			text = text + undoText;
			jl.setText(text);
			}
		} else {

			text += e.getKeyChar();
			jl.setText(text);
		}

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	/*
	 * Create a JFrame with a JPanel and a JLabel.
	 * 
	 * Every time a key is pressed, add that character to the JLabel. It should look
	 * like a basic text editor.
	 * 
	 * Make it so that every time the BACKSPACE key is pressed, the last character
	 * is erased from the JLabel. Save that deleted character onto a Stack of
	 * Characters.
	 * 
	 * Choose a key to be the Undo key. Make it so that when that key is pressed,
	 * the top Character is popped off the Stack and added back to the JLabel.
	 * 
	 */

}
