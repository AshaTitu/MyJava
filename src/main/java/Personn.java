class Personn {
    private String name;
    private long phno;

    public void read() {
        name = "Akash";
        phno = 928374993;
    }

    public void show() {
        System.out.println("Name = " + name);
        System.out.println("Phone = " + phno);
    }
}

class Student extends Personn {
    private int rollno;
    private String course;

    public void read() {
        super.read();
        rollno = 007;
        course = "Computer Science";
    }

    public void show() {
        super.show();
        System.out.println("Roll No. = " + rollno);
        System.out.println("Course = " + course);
    }
}

class Teacher extends Personn {
    private String dept_name;
    private String qual;

    public void read() {
        super.read();
        dept_name = "CSE";
        qual = "PhD";
    }

    public void show() {
        super.show();
        System.out.println("Department = " + dept_name);
        System.out.println("Qualification = " + qual);
    }
}
