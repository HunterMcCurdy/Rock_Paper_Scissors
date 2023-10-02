import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.Random;

public class RockPaperScissorsFrame {
        private JFrame window;
        private JTextArea displayTA = new JTextArea(10, 50);
        private String player = "";
        private int computer = 0;
        private int tie = 0;
        private int play = 0;

        public RockPaperScissorsFrame() {

        }

    public void initialize() {
        window = new JFrame();
        window.setTitle("Rock Paper Scissors Game");
        window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        window.setSize(1440, 1000);
        window.setLocationRelativeTo(null);
        window.setLayout(new BorderLayout(10, 5));
        window.setVisible(true);
    }

    public void createDisplayPanel() {
            JPanel displayPnl = new JPanel();
            RockPaperScissors();
            displayTA.setEditable(false);
            displayTA. setFont(new Font("Serif", Font. PLAIN, 24));
            JScrollPane scroller = new JScrollPane(displayTA);
            scroller.setVerticalScrollBarPolicy(JScrollPane. VERTICAL_SCROLLBAR_ALWAYS);
            displayPnl.add(scroller);
            window.add(displayPnl, BorderLayout.CENTER);
    }



    public void createControlPanel() {
        JPanel controlPnl = new JPanel();
        controlPnl.setLayout(new GridLayout(1, 4));


        JButton quitB = new JButton("Quit");

        ImageIcon rockI = new ImageIcon("src/rock.png");

        ImageIcon paperI = new ImageIcon("src/paper.png");
        ImageIcon scissorsI = new ImageIcon("src/scissors.png");
        JButton rock = new JButton(rockI);
        JButton paper = new JButton(paperI);
        JButton scissors = new JButton(scissorsI);
        controlPnl.add(quitB);
        controlPnl.add(rock);
        controlPnl.add(paper);
        controlPnl.add(scissors);
        quitB.addActionListener((ActionEvent ae) -> System.exit(0));
        rock.addActionListener((ActionEvent ae) -> actionRock());
        paper.addActionListener((ActionEvent ae) -> actionPaper());
        scissors.addActionListener((ActionEvent ae) -> actionScissors());
        window.add(controlPnl, BorderLayout.SOUTH);
        controlPnl.setBorder(BorderFactory.createLineBorder(Color.BLACK, 10));
    }

    public void RockPaperScissors(){
        String[] myArray = {"Rock",
                "Paper",
                "Scissors"};

        Random random = new Random();
        String randomElement = myArray[random.nextInt(myArray.length)];
        if (player.equalsIgnoreCase("rock"))
        {
            if (randomElement.equalsIgnoreCase("Rock"))
            {
                displayTA.append("Player Wins:          Computer Wins:          Ties:"  + "\n");
                displayTA.append(play + "                    " + computer + "                   " + tie + "\n");
                displayTA.append("It's a tie!" + "\n");
                tie = tie + 1;

            }
            else if (randomElement.equalsIgnoreCase("Paper"))
            {
                displayTA.append("Player Wins:          Computer Wins:          Ties:"  + "\n");
                displayTA.append(play + "                    " + computer + "                      " + tie + "\n");
                displayTA.append("Paper beats rock! Computer wins!" + "\n");
                computer = computer + 1;

            }
            else
            {
                displayTA.append("Player Wins:          Computer Wins:          Ties:"  + "\n");
                displayTA.append(play + "                    " + computer + "                      " + tie + "\n");
                displayTA.append("Rock beats scissors! Player wins!" + "\n");
                play = play + 1;


            }
        }
        else if (player.equalsIgnoreCase("paper"))
        {
            if (randomElement.equalsIgnoreCase("Rock"))
            {
                displayTA.append("Player Wins:          Computer Wins:          Ties:"  + "\n");
                displayTA.append(play + "                    " + computer + "                      " + tie + "\n");
                displayTA.append("Paper beats rock! Player wins!" + "\n");
                play = play + 1;


            }
            else if (randomElement.equalsIgnoreCase("Paper")) {
                displayTA.append("Player Wins:          Computer Wins:          Ties:" + "\n");
                displayTA.append(play + "                    " + computer + "                      " + tie + "\n");
                displayTA.append("It's a tie!" + "\n");
                tie = tie + 1;
            }
            else
            {
                displayTA.append("Player Wins:          Computer Wins:          Ties:"  + "\n");
                displayTA.append(play + "                    " + computer + "                      " + tie + "\n");
                displayTA.append("Scissors beats paper! Computer wins!" + "\n");
                computer = computer + 1;

            }
        }
        else if(player.equalsIgnoreCase("scissors"))
        {
            if (randomElement.equalsIgnoreCase("scissors"))
            {
                displayTA.append("Player Wins:          Computer Wins:          Ties:"  + "\n");
                displayTA.append(play + "                    " + computer + "                      " + tie + "\n");
                displayTA.append("It's a tie!" + "\n");
                tie = tie + 1;

            }
            else if (randomElement.equalsIgnoreCase("Paper"))
            {
                displayTA.append("Player Wins:          Computer Wins:          Ties:"  + "\n");
                displayTA.append(play + "                    " + computer + "                      " + tie + "\n");
                displayTA.append("Scissors beats paper! Player wins!" + "\n");
                play = play + 1;

            }
            else
            {
                displayTA.append("Player Wins:          Computer Wins:          Ties:"  + "\n");
                displayTA.append(play + "                    " + computer + "                      " + tie + "\n");
                displayTA.append("Rock beats scissors! Computer wins!" + "\n");
                computer = computer + 1;

            }
        }



    }

    public void actionRock(){
            player = "Rock";
            RockPaperScissors();
    }

    public void actionPaper(){
        player = "Paper";
        RockPaperScissors();
    }

    public void actionScissors(){
        player = "Scissors";
        RockPaperScissors();
    }






}
