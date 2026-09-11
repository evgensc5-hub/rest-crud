package pixel.academy.rest_crud_app.entity;

import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {
    private List<Student>theStudents;//**

    //* definim endpoint-ul pentru /student
    //*@GetMapping("/strudents")
    //*public List<Student> getStudents() {
    @PostConstruct
    public void loadData(){

        //*List<Student> theStudents = new ArrayList<>();
        theStudents = new ArrayList<>();//**

        theStudents.add(new Student("Munteanu", "Eugen"));
        theStudents.add(new Student("Ojog", "Maria"));
        theStudents.add(new Student("Gonzales", "Pedro"));

        //*return theStudents;
    }

    //**definim endpointul pentru /Students
    @GetMapping("/students")
    public List<Student>getStudents() {

        return theStudents;
    }
    //definim un endpoint ca sa afisam toti studentii nostri dupa index
    @GetMapping("/students/{studentId}")
    public Student getStudent(@PathVariable int studentId) {

        return theStudents.get(studentId);
    }
}
