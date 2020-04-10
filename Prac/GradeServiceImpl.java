package Prac;

public class GradeServiceImpl {
	private Grade[] grades;
	private int count;
	
	public GradeServiceImpl() {
		grades = new Grade[3];
		count=0;
	}
	
	public void add(Grade grade) {
		grades[count] = grade;
		count++;
	}

	public Grade[] getGrades() {
		return grades;
	}

	public void setGrades(Grade[] grades) {
		this.grades = grades;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
	
	
}
