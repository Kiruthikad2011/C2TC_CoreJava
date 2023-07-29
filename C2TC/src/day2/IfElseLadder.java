package day2;

public class IfElseLadder {

	    public static void main(String[] args) {

	        int examscore = 75;
	        char grade;

	        if(examscore >= 90) {
	            grade = 'A';
	        } else if (examscore >= 80) {
	            grade = 'B';
	        } else if(examscore >= 70) {
	            grade = 'C';
	        } else if(examscore >= 60) {
	            grade = 'D';
	        } else {
	            grade = 'F';
	        }
	        System.out.println("Grade is = " + grade);
	    }
	}

