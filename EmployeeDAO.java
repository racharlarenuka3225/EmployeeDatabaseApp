package advJava;

import java.sql.*;
import java.util.*;
import advJava.DBCconnection.DBConnection;
public class EmployeeDAO {
    
    // Add Employee
    public void addEmployee(Employee emp) {
        String sql = "INSERT INTO employee(name, department, salary) VALUES (?, ?, ?)";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, emp.getName());
            stmt.setString(2, emp.getDepartment());
            stmt.setDouble(3, emp.getSalary());
            stmt.executeUpdate();
            System.out.println("✅ Employee Added!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Fetch All Employees
    public List<Employee> getAllEmployees() {
        List<Employee> list = new ArrayList<>();
        String sql = "SELECT * FROM employee";
        try (Connection conn = DBConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                list.add(new Employee(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("department"),
                        rs.getDouble("salary")));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    // Update Salary
    public void updateEmployee(int id, double newSalary) {
        String sql = "UPDATE employee SET salary=? WHERE id=?";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setDouble(1, newSalary);
            stmt.setInt(2, id);
            stmt.executeUpdate();
            System.out.println("✅ Employee Updated!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Delete Employee
    public void deleteEmployee(int id) {
        String sql = "DELETE FROM employee WHERE id=?";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
            System.out.println("✅ Employee Deleted!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
