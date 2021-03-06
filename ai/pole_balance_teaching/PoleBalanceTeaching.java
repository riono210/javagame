import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JFrame;

/*
 * 作成日: 2005/09/11
 *
 */

/**
 * アプリケーションクラス。
 * @author mori
 *
 */
public class PoleBalanceTeaching extends JFrame {
    public PoleBalanceTeaching() {
        // タイトルを設定
        setTitle("倒立振子制御の教示学習");

        Container contentPane = getContentPane();
        
        // インフォメーションパネルを作成
        InfoPanel infoPanel = new InfoPanel();
        contentPane.add(infoPanel, BorderLayout.NORTH);
        
        // メインパネルを作成
        MainPanel mainPanel = new MainPanel();
        contentPane.add(mainPanel, BorderLayout.CENTER);
        // メインパネルにインフォメーションパネルを渡す
        mainPanel.setInfoPanel(infoPanel);
        
        // コントロールパネルを作成
        ControlPanel controlPanel = new ControlPanel(mainPanel);
        contentPane.add(controlPanel, BorderLayout.SOUTH);

        // パネルサイズに合わせてフレームサイズを自動設定
        pack();
    }

    public static void main(String[] args) {
        PoleBalanceTeaching frame = new PoleBalanceTeaching();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

