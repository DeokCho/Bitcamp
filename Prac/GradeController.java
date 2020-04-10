package Prac;

import javax.swing.JOptionPane;
import Prac.Constance.PracConstance;

public class GradeController {
	public static void main(String[] args) {
		while (true) {
			switch (JOptionPane.showInputDialog(PracConstance.GRADE_MENU)) {
			case "0":
				return;
			case "1":
				for (int i = 0; i < 3; i++) {
					String[] value = JOptionPane.showInputDialog(PracConstance.GRADE_INPUT).split(",");
					
				}
			}
		}
	}
}
