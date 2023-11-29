public class Main {
    public static void main(String[] args) {
        Employee developer1 = new Developer("Иван", "Developer");
        Employee developer2 = new Developer("Петр", "Developer");

        Department department1 = new Department("Development");
        Department department2 = new Department("Testing");


        department1.addEmployee(developer1);
        department2.addEmployee(developer2);


        Department mainDepartment = new Department("Management");
        mainDepartment.addEmployee(department1);
        mainDepartment.addEmployee(department2);


        mainDepartment.showDetails();
    }
}//вариант3
//Реализуйте структуру организационной иерархии компании по паттерну "Компоновщик", где подразделения и сотрудники могут быть организованы в древовидную структуру.
