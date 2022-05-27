package com.example.cloudspring.Repo;
import com.example.cloudspring.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee,Integer> {
    public Employee findByAid(int id);
}
