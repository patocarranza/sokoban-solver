import java.io.IOException;
import javax.swing.UIManager;

/**
 * SokobanTester solves easy to moderate sokoban puzzles using different search algorithms.
 * Search algorithms are based on the textbook pseudocode, and Hungarian Algorithm is from wikipedia.
 * @author Hyun Seung Hong (hh2473)
 *
 */
public class SokobanTester {

	public static void main(String[] args) {            
                try {            
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                } catch (ClassNotFoundException ex) {
                } catch (InstantiationException ex) {
                } catch (IllegalAccessException ex) {
                } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                }   
		try {
			MainFrame m = new MainFrame();
		} catch (IOException e) {
			System.out.println("IO Exception occured");
			e.printStackTrace();
		}
	}

}
