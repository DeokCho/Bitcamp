package com.jse.card;

import com.jse.util.Constants;
import com.sun.corba.se.spi.orbutil.fsm.Input;

import javax.swing.JOptionPane;

public class CardController {
	public static void main(String[] args) {
		CardService service = new CardServiceImpl();
		Card card = null;

		while (true) {
			System.out.println();
			
			switch (JOptionPane.showInputDialog(Constants.CARD_MENU)) {
			case "0": return;
			case "1":
				for (int i = 0; i < 3; i++) {
					card = new Card();
					String[] values = JOptionPane.showInputDialog(Constants.CARD_TAKE).split(",");
					card.setKind(values[0]);
					card.setNumber(Integer.parseInt(values[1]));
					service.add(card);
				}
				break;
//				CardBean card = new CardBean(sc.next(), sc.nextInt());
//				service.add(card);
//				break; 위의 for문에서 반복하는 내용
			case "2":
				Card[] cards = service.list();
				String message = "";
				for(int i=0; i<cards.length; i++) {
					message += cards[i].toString()+"\n";
				}
				JOptionPane.showMessageDialog(null, message);
				break;

			}
		}
	}
}
