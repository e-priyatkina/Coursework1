public class Methods {
    public static float countAllSalary(Employee[] employees, float salary) { //сумма затрат на зарплаты
        float allSalary = 0;
        for (Employee employee : employees) {
            allSalary = allSalary + employee.getSalary();
        }
        return allSalary;
    }

    public static Employee minimumSalary(Employee[] employees) { //минимальная зарплата
        float min = 100000;
        Employee employee = new Employee("", 0, 0);
        for (Employee value : employees) {
            if (value.getSalary() < min) {
                min = value.getSalary();
                employee = value;
            }
        }
        return employee;
    }

    public static Employee maximumSalary(Employee[] employees) { //максимальная зарплата
        float max = 50000;
        Employee employee = new Employee("", 0, 0);
        for (Employee value : employees) {
            if (value.getSalary() > max) {
                max = value.getSalary();
                employee = value;
            }
        }
        return employee;
    }

    public static float averageSalary(Employee[] employees) { //средняя зарплата
        float average = 0;
        for (Employee employee : employees) {
            average = countAllSalary(employees, employee.getSalary());
        }
        average = average / employees.length + average % employees.length;
        return average;
    }

    public static void indexSalary(Employee[] employees, float index) { //увеличение зарплаты
        for (Employee employee : employees) {
            employee.setSalary(employee.getSalary() * index);
            System.out.println(employee.toString());
        }
    }

    public static Employee minimumSalaryDepartment (int department, Employee[] employees) { //минимальная зарплата по отделу
        float min = 100000;
        Employee employee = new Employee("", 0, 0);
        for (Employee value : employees) {
            if (value.getSalary() < min && value.getDepartment() == department) {
                min = value.getSalary();
                employee = value;
            }
        }
        return employee;
    }

    public static Employee maximumSalaryDepartment(int department, Employee[] employees) { //максимальная зарплата по отделу
        float max = 50000;
        Employee employee = new Employee("", 0, 0);
        for (Employee value : employees) {
            if (value.getSalary() > max && value.getDepartment() == department) {
                max = value.getSalary();
                employee = value;
            }
        }
        return employee;
    }

    public static float countAllSalaryDepartment(int department, Employee[] employees, float salary) { //общая зарплата по отделу
        float allSalary = 0;
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                allSalary = allSalary + employee.getSalary();
            }
        }
        return allSalary;
    }

    public static float averageSalaryDepartment(int department, Employee[] employees) { //средняя зарплата по отделу
        float average = 0;
        int k = 0; //количество сотрудников
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                average = countAllSalaryDepartment(department, employees, employee.getSalary());
                k++;
            }
        }
        average = average / k + average % k;
        return average;
    }

    public static void indexSalaryDepartment(int department, Employee[] employees, float index) { //увеличение зарплаты в отделе
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                employee.setSalary(employee.getSalary() * index);
                System.out.println(employee.toString());
            }
        }
    }

    public static void printEmployeesDepartment(int department, Employee[] employees) { //список сотрудников отдела
        for (Employee employee : employees) {
            if (employee.getDepartment() == department) {
                System.out.println(employee.toStringId() + " " + employee.getFullName() + " " +
                        employee.getSalary());
            }
        }
    }

    public static void lessNumber(int number, Employee[] employee) { //зарплата меньше числа
        for (Employee value : employee) {
            if (value.getSalary() < number) {
                System.out.println(value.toStringId() + " " + value.getFullName() + " " +
                        value.getSalary());
            }
        }
    }

    public static void moreNumber(int number, Employee[] employee) { //зарплата больше числа
        for (Employee value : employee) {
            if (value.getSalary() >= number) {
                System.out.println(value.toStringId() + " " + value.getFullName() + " " +
                        value.getSalary());
            }
        }
    }
}
