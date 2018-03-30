package ceshi.traingame;

import java.awt.FlowLayout;
import javax.swing.JFrame;

public class TrainGameFrame extends JFrame {
	
	/**
	 * ���췽��
	 */
	public TrainGameFrame() {
		setSize(1024, 700);	//���ô����С
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);	//���ô�������Ļ����
		setTitle("TrainGame");		//���ñ���ΪTrainGame
		setResizable(false);		//������������
		setLayout(new FlowLayout());	//���ò��ֹ�����
		
		TrainGame game = new TrainGame();
		add(game);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new TrainGameFrame();
	}
}
