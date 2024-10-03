public class TeacherGroup implements Iterable<Teacher> {
    private List<Teacher> teacherList;
    public List<Teacher> getTeacherList() {
        return teacherList;
    }
    public void setTeacherList(List<Teacher> teacherList) {
        this.teacherList = teacherList;
    }
    public void createTeacher(String firstName, String lastName, String middleName){
        teacherList.add(new Teacher(firstName, lastName, middleName));
    }
    public Iterator<Teacher> iterator() {
        return new TeacherGroupIterator(this);
    }
}
