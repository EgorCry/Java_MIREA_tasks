package Task_10;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Music obj = new Music();
            obj.LoopMusic("src\\Task_10\\Music\\Naruto.wav");//Music plays after 3 sec. Idk. This is original track

            Calculator app = new Calculator();
            app.setVisible(true);
        });
    }
}