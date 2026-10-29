package lab2.composition;

import java.util.Arrays;

public class Exam {
	public final int id;
	public final int maxStudents;
	public int registeredStudents;
	public final String courseName;
	public Professor professor;
	public ExamRoom room;
	public Student[] students;
	
	public Exam(final int id, final int maxStudents, final String courseName, Professor professor, ExamRoom room) {
		this.id=id;
		this.maxStudents=maxStudents;
		this.courseName=courseName;
		this.professor=professor;
		this.room=room;
		this.students = new Student[this.maxStudents];
	}
	
	public int getRegisteredStudents() {
		return registeredStudents;
	}

	public Professor getProfessor() {
		return professor;
	}

	public ExamRoom getRoom() {
		return room;
	}

	public Student[] getStudents() {
		return students;
	}

    public String toString() {
        return "Exam[id=" + this.id
                + ", max participants=" + this.maxStudents
                + ", registered so far=" + this.registeredStudents 
                + ", course name=" + this.courseName
                + ", Professor=" + this.professor.toString()
                + ", exam room=" + this.room.toString()
                + ", Students=" + Arrays.toString(students) + "]";
    }

	public int getMaxStudents() {
		return maxStudents;
	}
	
	public void registerStudent(Student student) {
		registeredStudents++;
		if(registeredStudents <= maxStudents)
			this.students[registeredStudents-1] = student;
	}
	
	
}
