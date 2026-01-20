/*
UP & DOWN 게임 (스윙 이용)
 */

package Ex10;

import javax.swing.*;

public class Ex10 extends JFrame {
    public Ex10() {
        setTitle("UP & DOWN Game"); // 창 제목
        setSize(400, 300); // 창 크기 (가로, 세로)
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel();
        JButton button = new JButton("확인");

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new Ex10();
        });
    }
}
