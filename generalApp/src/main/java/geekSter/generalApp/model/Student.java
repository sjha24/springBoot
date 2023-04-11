package geekSter.generalApp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    private int StudentID;
    private String StudentName;
    private int age;
    private int rollNum;
    private String grade;
    private String DateOfBirth;
    private String Gender;
}
