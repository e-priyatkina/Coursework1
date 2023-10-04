public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        int i = 0;
        employees[i] = new Employee("Комиссаров Абрам Ростиславович", 3, 64000);
        i++;
        employees[i] = new Employee("Николаев Адриан Миронович", 1, 51000);
        i++;
        employees[i] = new Employee("Воронова Мила Семёновна", 2, 72000);
        i++;
        employees[i] = new Employee("Щукина Тамара Яковлевна", 5, 95000);
        i++;
        employees[i] = new Employee("Казаков Виссарион Германович", 4, 78000);
        i++;
        employees[i] = new Employee("Евдокимова Нонна Альбертовна", 4, 67000);
        i++;
        employees[i] = new Employee("Титов Виссарион Глебович", 1, 63000);;
        i++;
        employees[i] = new Employee("Силина Иветта Даниловна", 3, 75000);
        i++;
        employees[i] = new Employee("Зыкова Эдуарда Аркадьевна", 2, 83000);
        i++;
        employees[i] = new Employee("Шаров Петр Христофорович", 5, 91000);

        for (i = 0; i < employees.length; i++) {
            System.out.println(employees[i].toString());
        }

        float allSalary = 0;
        for (i = 0; i < employees.length; i++) {
            allSalary = Methods.countAllSalary(employees, employees[i].getSalary());
        }
        System.out.println("Сумма затрат на зарплаты в месяц: " + allSalary);

        System.out.println("Сотрудник с минимальной зарплатой: " + Methods.minimumSalary(employees));
        System.out.println("Сотрудник с максимальной зарплатой: " + Methods.maximumSalary(employees));
        System.out.println("Среднее значение зарплат: " + Methods.averageSalary(employees));

        for (i = 0; i < employees.length; i++) {
            System.out.println(employees[i].getFullName());
        }

        //   Methods.indexSalary(employees, 1.07f); //увеличиваем зарплату на 7%

        System.out.println("Минимальная зарплата сотрудника из 2 отдела: " +
                Methods.minimumSalaryDepartment(2, employees));

        System.out.println("Максимальная зарплата сотрудника из 4 отдела: " +
                Methods.maximumSalaryDepartment(4, employees));

        allSalary = 0;
        for (i = 0; i < employees.length; i++) {
            allSalary = Methods.countAllSalaryDepartment(3, employees, employees[i].getSalary());
        }
        System.out.println("Сумма зарплат по 3 отделу: " + allSalary);

        System.out.println("Средняя зарплата по 5 отделу: " +
                Methods.averageSalaryDepartment(5, employees));

        //    System.out.println("Индексирование зарплаты по 2 отделу:");
        //    Methods.indexSalaryDepartment(2, employees, 1.06f);

        System.out.println("Сотрудники 3 отдела:");
        Methods.printEmployeesDepartment(3, employees);

        System.out.println("Сотрудники с зарплатой меньше 72000:");
        Methods.lessNumber(72000, employees);

        System.out.println("Сотрудники с зарплатой больше 72000:");
        Methods.moreNumber(72000, employees);
    }
}