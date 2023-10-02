import javax.swing.SwingUtilities;
public class RockPaperScissorsRunner {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                RockPaperScissorsFrame main = new RockPaperScissorsFrame();
                main.initialize();
                main.createDisplayPanel();
                main.createControlPanel();


            }
        });
    }
}