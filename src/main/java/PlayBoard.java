import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PlayBoard extends JFrame{
    private final int playBoardSize = 19;
    private TicTacUnit ticTacUnits [][];

    public PlayBoard() {
        super("Tic Tac Toe");
        this.ticTacUnits = new TicTacUnit[this.playBoardSize][this.playBoardSize];
        this.createTicTacToe();
        initialize();
        addAction();
    }

    public void initialize(){
        setLayout(new GridLayout(this.playBoardSize,this.playBoardSize,-5,-5));
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }


    public ActionListener createAction(TicTacUnit ticTacUnit){
        ActionListener al = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ticTacUnit.getjButton().setText("X");
                System.out.println("{{{{{ " + ticTacUnit.get_x() + " " + ticTacUnit.get_y());
            }
        };
        return al;
    }

    private void addAction(){
        for (int i = 0; i < ticTacUnits.length; i++){
            for (int j = 0; j < ticTacUnits[i].length; j++){
                ticTacUnits[i][j].getjButton().addActionListener(createAction(ticTacUnits[i][j]));
            }
        }
    }


    private void createTicTacToe(){
        for (int i = 0; i < ticTacUnits.length; i++){
            for (int j = 0; j < ticTacUnits[i].length; j++){
                ticTacUnits[i][j] = new TicTacUnit(null,i,j);
                add(ticTacUnits[i][j].getjButton());
            }
        }

//        for (int i = 0; i < ticTacUnits.length; i++){
//            for (int j = 0; j < ticTacUnits[i].length; j++){
//                System.out.println(ticTacUnits[i][j]);
//            }
//        }
    }

}
