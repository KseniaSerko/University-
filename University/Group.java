package University;

public class Group {
		private String groupName;
		private int course;
		private Teacher teacher;
		private Student[] student;
		public Group(String name, int course, Teacher teacher, Student[] student) {
				this.teacher=teacher;
				this.student=student;
		        this.groupName = name;
		        this.course = course;
			}

		public void setGroupName(String groupName) {
			this.groupName = groupName;
		}
		public void setCourse(int course) {
			this.course = course;
		}
		public String getGroupName(){
			return groupName;
		}
		public int getCourse(){
			return course;
		}
		public Teacher getTeacher() {
			return teacher;
		}
		public void setTeacher(Teacher teacher) {
			this.teacher = teacher;
		}
		public Student[] getStudent() {
			return student;
		}
		public void setStudent2(Student[] student2) {
			this.student = student;
		}
		}

