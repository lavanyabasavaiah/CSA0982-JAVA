class Student {
    String name; int regNum, total = 0; double average;
    Student(String name, int regNum, int[] marks) {
        this.name = name; this.regNum = regNum;
        for (int mark : marks) total += mark;
        average = (double) total / marks.length;
    }
    void display() {
        System.out.println("Name: " + name + ", RegNum: " + regNum + ", Total: " + total + ", Average: " + average);
    }
    public static void main(String[] args) {
        new Student("John", 12345, new int[]{85, 92, 78, 90, 88}).display();
    }
}
