package ceshi.traingame;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 * ������
 * @author Leslie Leung
 */
public class ImageFactory {
	private static ClassLoader loader;		//����ClassLoader����

	static {	
		loader = ImageFactory.class.getClassLoader();	//��ʼ��loader
	}

	/* ����Image��Դ���� */
	public static Image createImage(String ImageName) {
		ImageIcon icon = new ImageIcon(loader.getResource("resource/"+ImageName + ".png"));
		return icon.getImage();
	}
}
