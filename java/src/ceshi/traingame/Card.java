package ceshi.traingame;

import java.awt.Color;
import java.awt.Graphics;

/**
 * ֽ����
 * @author Leslie Leung
 */
public class Card {
	public static final int SUIT_SPADE = 0;		//��ʾ����
	public static final int SUIT_HEART = 1;		//��ʾ����
	public static final int SUIT_DIAMOND = 2;	//��ʾ����
	public static final int SUIT_CLUB = 3;		//��ʾ÷��

	/* ��ʾ13�ֵ���   */
	public static final int POINT_A = 1;
	public static final int POINT_2 = 2;
	public static final int POINT_3 = 3;
	public static final int POINT_4 = 4;
	public static final int POINT_5 = 5;
	public static final int POINT_6 = 6;
	public static final int POINT_7 = 7;
	public static final int POINT_8 = 8;
	public static final int POINT_9 = 9;
	public static final int POINT_10 = 10;
	public static final int POINT_J = 11;
	public static final int POINT_Q = 12;
	public static final int POINT_K = 13;

	public static final int CARD_WIDTH = 71;		//ֽ�ƵĿ��
	public static final int CARD_HEIGHT = 96;		//ֽ�Ƶĸ߶�

	private int suit;	//��ʾֽ�ƵĻ�ʽ
	private int point;	//��ʾֽ�Ƶĵ���
	private boolean selected;	//��ʾֽ���Ƿ�ѡ��
	private boolean face;	//��ʾֽ���Ǳ��泯�ϻ������泯��
	private int x;		//������
	private int y;		//������

	/**
	 * ���췽��
	 * @param point ֽ�Ƶĵ���
	 * @param suit ֽ�ƵĻ�ʽ
	 */
	public Card(int point, int suit) {
		this.point = point;	//����ֽ�Ƶĵ���
		this.suit = suit;	//����ֽ�ƵĻ�ʽ
		selected = false;	//Ĭ��ֽ��û��ѡ��
		face = false;		//Ĭ��ֽ�Ʊ��泯��
	}

	/**
	 * ��ȡ��ֽ�Ƶĺ�����
	 * @return ������
	 */
	public int getX() {
		return x;
	}

	/**
	 * ��ȡ��ֽ�Ƶ�������
	 * @return ������
	 */
	public int getY() {
		return y;
	}

	/**
	 * ����ֽ�Ƶĺ�����
	 * @param x ������
	 */
	public void setX(int x) {
		this.x = x;
	}

	/**
	 * ����ֽ�Ƶ�������
	 * @param y ������
	 */
	public void setY(int y) {
		this.y = y;
	}

	/**
	 * ��ȡĳ��ֽ�Ƶĵ���
	 * @return ��ֽ�Ƶĵ���
	 */
	public int getPoint() {
		return point;
	}

	/**
	 * ����ֽ���Ƿ����泯��
	 * @param isOpen �Ƿ����泯��
	 */
	public void setFace(boolean isOpen) {//isOpenΪtrue�����泯�ϣ�false�����泯��
		face = isOpen;	
	}

	/**
	 * ����ֽ���Ƿ�ѡ��
	 * @param isSelected �Ƿ�ѡ��
	 */
	public void setSelected(boolean isSelected) {//isSelectedΪtrue����ѡ�У�false��ûѡ��
		selected = isSelected;
	}

	/**
	 * �ж�ֽ���Ƿ�ѡ��
	 * @return true����ѡ�У�false��û��ѡ��
	 */
	public boolean isSelected() {
		return selected == true;
	}

	/**
	 * ����ֽ��
	 * @param g Graphics����
	 */
	public void paintCard(Graphics g) {
		if(!selected && face) {//���ֽ��û��ѡ�ж������泯��
			g.drawImage(ImageFactory.createImage(suit + "_" + point), x, y, CARD_WIDTH, CARD_HEIGHT, null);
		} else if(!selected && !face) {//���ֽ��û��ѡ�ж��ұ��泯��
			g.drawImage(ImageFactory.createImage("back"), x, y, CARD_WIDTH, CARD_HEIGHT, null);
		} else if(selected && face) {//���ֽ�Ʊ�ѡ�������泯��
			g.setColor(Color.YELLOW);
			g.drawRect(x - 1, y - 1, CARD_WIDTH + 2, CARD_HEIGHT + 2);
			g.drawImage(ImageFactory.createImage(suit + "_" + point), x, y, CARD_WIDTH, CARD_HEIGHT, null);
		}
	}
}
