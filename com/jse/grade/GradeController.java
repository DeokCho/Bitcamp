package com.jse.grade;

import javax.swing.JOptionPane;

import com.jse.member.Member;
import com.jse.util.Constants;

public class GradeController {

	// "[%s : 총점 %d 점, 평균 %d 점,학점 : %s]"

	public static void main(String[] args) {
		GradeService gradeService = new GradeServiceImpl();
		Member[] members = new Member[3];
		Grade grade = null;
		while (true) {
			switch (JOptionPane.showInputDialog(Constants.GRADE_MENU)) {
			case "0":
				return;
			case "1":
				for (int i = 0; i < 3; i++) {
					String[] values = JOptionPane.showInputDialog(Constants.GRADE_INPUT).split(",");
					grade = new Grade();
					grade.setName(values[0]);
					grade.setKorean(Integer.parseInt(values[1]));
					grade.setEnglish(Integer.parseInt(values[2]));
					grade.setMath(Integer.parseInt(values[3]));
					gradeService.add(grade);

				}

				break;
			case "2":
				JOptionPane.showMessageDialog(null, gradeService.list());
				break;
			case "3":
				JOptionPane.showMessageDialog(null, Constants.GRADE_RANK);
				
				
			}
		}
	}

}