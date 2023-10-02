public class Employee {
    class Employee {
        private String employeeID;
        private String name;
        private static final String designation = "Lab Attendant";

        public Employee() {
        }

        public Employee(String employeeID, String name) {
            this.employeeID = employeeID;
            this.name = name;
        }

        // Getter and Setter methods
        public String getEmployeeID() {
            return employeeID;
        }

        public void setEmployeeID(String employeeID) {
            this.employeeID = employeeID;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public static String getDesignation() {
            return designation;
        }
    }

}
