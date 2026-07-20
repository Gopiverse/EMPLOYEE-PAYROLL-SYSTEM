import java.sql.*;
import java.sql.SQLIntegrityConstraintViolationException;

public class EmployeeCRUD {

    public void addEmployee(Employee emp) {

        try {

            Connection con = DBConnection.getConnection();

            Statement st = con.createStatement();

            String query = "INSERT INTO employees(id, name, department, salary) VALUES('" +  emp.getId() + "','" +  
                            emp.getName() + "', '" +
                            emp.getDept() + "', " +
                            emp.getSalary() + ")";

            int rows = st.executeUpdate(query);

            if (rows > 0) {
                System.out.println("Employee Added Successfully!");
            }

            con.close();

        } 

	catch(SQLIntegrityConstraintViolationException e) {
    		System.out.println("Employee ID already exists!");
	}
	catch(SQLException e) {
    		System.out.println("Database Error!");
	}
    }

    public void displayEmployees() {

        try {

            Connection con = DBConnection.getConnection();

            Statement st = con.createStatement();

            String query = "SELECT * FROM employees";

            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {

                Employee emp = new Employee(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("department"),
                        rs.getDouble("salary")
                );

                System.out.println(emp + "\n-----------------------");
            }

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public void searchEmployee(int id) {

        try {

            Connection con = DBConnection.getConnection();

            Statement st = con.createStatement();

            String query = "SELECT * FROM employees WHERE id = " + id;

            ResultSet rs = st.executeQuery(query);

            if (rs.next()) {

                Employee emp = new Employee(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("department"),
                        rs.getDouble("salary")
                );

                System.out.println(emp);

            } else {

                System.out.println("Employee Not Found!");

            }

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void updateSalary(int id, double salary) {

        try {

            Connection con = DBConnection.getConnection();

            Statement st = con.createStatement();

            String query = "UPDATE employees SET salary = " + salary +
                           " WHERE id = " + id;

            int rows = st.executeUpdate(query);

            if (rows > 0) {
                System.out.println("Salary Updated!");
            } else {
                System.out.println("Employee Not Found!");
            }

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deleteEmployee(int id) {

        try {

            Connection con = DBConnection.getConnection();

            Statement st = con.createStatement();

            String query = "DELETE FROM employees WHERE id = " + id;

            int rows = st.executeUpdate(query);

            if (rows > 0) {
                System.out.println("Employee Deleted!");
            } else {
                System.out.println("Employee Not Found!");
            }

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}