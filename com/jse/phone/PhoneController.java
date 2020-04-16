package com.jse.phone;

import javax.swing.JOptionPane;
import com.jse.util.Constants;

public class PhoneController {
	public static void main(String[] args) {
		PhoneServiceImpl service = new PhoneServiceImpl();
		while (true) {
			System.out.println();
			switch (JOptionPane.showInputDialog(Constants.MENU)) {
			case "0":
				System.out.println("종료");
				return;
			case "1":
				for (int i = 0; i < 3; i++) {
					String[] values = JOptionPane.showInputDialog(Constants.PHONE_MENU).split(",");
					service.add(new Phone(values[0], values[1], values[2]));
				}
				break;
			case "2":
				System.out.println("주소록 출력");
				Phone[] phones = service.list();
				String message = "";
				for (int i = 0; i < 3; i++) {
					message +=  phones[i].toString()+"\n";
				}
				JOptionPane.showMessageDialog(null, message);
				break;
			case "3":
				for (int i = 0; i < 3; i++) {
					String[] values2 = JOptionPane.showInputDialog
							(Constants.CELLPHONE_MENU).split(",");
					service.add
					(new CellPhone(values2[0], values2[1], values2[2], true));
				}
				break;
			case "4":
				CellPhone[] cellPhones = service.getCellPhones();
				String message2 = "";
				for (int i = 0; i < 3; i++) {
					message2 += cellPhones[i].toString()+"\n";
				}
				JOptionPane.showMessageDialog(null, message2);
				break;
			case "5":
				for(int i=0; i<3; i++) {
					String[] values3 = JOptionPane.showInputDialog
							(Constants.IPHONE_MENU).split(",");
					service.add
					(new Iphone(values3[0], values3[1], values3[2], true, values3[4]));
				}				
					break;
			case "6":
				Iphone[] iphones = service.getIphones();
				String message3 = "";
				for(int i=0; i<3; i++) {
					message3 += iphones[i].toString()+"\n";
				}
				JOptionPane.showMessageDialog(null, message3);
			case"7":
				for(int i=0; i<3; i++) {
					String[] values4 = JOptionPane.showInputDialog
							(Constants.GALLAXYNOTE_MENU).split(",");
					service.add(new GallaxyNote(values4[0],values4[1],values4[2],true,values4[4],values4[5]));
				}
				break;
			case"8":
				GallaxyNote[] gallaxyNotes = service.getGallaxyNote();
				String message4 = "";
				for(int i=0; i<3; i++) {
					message4 += gallaxyNotes[i].toString()+"\n";
				}
				JOptionPane.showMessageDialog(null, message4);
				break;
			}

		}
	}
}
