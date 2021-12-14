package immutable;

import java.util.Arrays;
import java.util.Objects;

public final class Student {

    private final String name;
    private final int age;
    private final String group;
    private final int[] averageScores;
    private final Appartment appartment;

    public Student(String name, int age, String group, int[] averageScores, Appartment appartment) {
        this.name = name;
        this.age = age;
        this.group = group;
        this.averageScores = Arrays.copyOf(averageScores, averageScores.length);
        this.appartment = new Appartment(appartment.getAddress(), appartment.isDormitory());
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGroup() {
        return group;
    }

    public int[] getAverageScores() {
        return Arrays.copyOf(averageScores, averageScores.length);
    }

    public Appartment getAppartment() {
        return new Appartment(appartment.getAddress(), appartment.isDormitory());
    }

    public Student setName(String name) {
        return new Student(name, this.age, this.group, this.averageScores, this.appartment);
    }
    public Student setAge(int age) {
        return new Student(name, age, this.group, this.averageScores, this.appartment);
    }
    public Student setGroup(String group) {
        return new Student(name, age, group, this.averageScores, this.appartment);
    }
    public Student setAverageScores(int[] averageScores) {
        return new Student(name, age, group, averageScores, this.appartment);
    }
    public Student setAppartment(Appartment appartment) {
        return new Student(name, age, group, averageScores, appartment);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name) &&
                Objects.equals(group, student.group) &&
                Arrays.equals(averageScores, student.averageScores) &&
                Objects.equals(appartment, student.appartment);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name, age, group, appartment);
        result = 31 * result + Arrays.hashCode(averageScores);
        return result;
    }
}
