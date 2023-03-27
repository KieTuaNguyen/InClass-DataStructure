class StudentNode {
  String name;
  String id;
  String major;
  double gpa;
  StudentNode next;

  public StudentNode(String name, String id, String major, double gpa) {
    this.name = name;
    this.id = id;
    this.major = major;
    this.gpa = gpa;
    this.next = null;
  }

  public String toString() {
    return "Name: " + this.name + ", ID: " + this.id + ", Major: " + this.major + ", GPA: " + this.gpa + "\r\n";
  }
}
