import ui.LoginWindow;
import javax.swing.SwingUtilities;
public class App {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(LoginWindow::new);
    }
}
