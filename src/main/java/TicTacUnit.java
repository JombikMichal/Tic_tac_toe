import javax.swing.*;
import java.awt.*;
import java.util.Objects;

public class TicTacUnit {
    private JButton jButton;
    private Player player;
    private int _x;
    private int _y;

    public TicTacUnit(Player player, int _x, int _y) {
        this.player = player;
        this._x = _x;
        this._y = _y;
        this.jButton = new JButton();
        initialize();
    }

    public JButton getjButton() {
        return jButton;
    }

    private void initialize(){
        this.jButton.setPreferredSize(new Dimension(40,40));
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public int get_x() {
        return _x;
    }

    public void set_x(int _x) {
        this._x = _x;
    }

    public int get_y() {
        return _y;
    }

    public void set_y(int _y) {
        this._y = _y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TicTacUnit that = (TicTacUnit) o;
        return _x == that._x &&
                _y == that._y &&
                Objects.equals(player, that.player);
    }

    @Override
    public int hashCode() {
        return Objects.hash(player, _x, _y);
    }
}
