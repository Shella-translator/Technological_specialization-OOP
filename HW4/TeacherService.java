public List<Teacher> getSortedTeacherByFIO() {
    List<Teacher> teacherList = new ArrayList<>(teacherGroup.getTeacherList());
    teacherList.sort(new UserComparator<Teacher>());
    return teacherList;
}

public void createTeacher(String firstName, String lastName, String middleName){
    teacherGroup.createTeacher(firstName, lastName, middleName);
}
