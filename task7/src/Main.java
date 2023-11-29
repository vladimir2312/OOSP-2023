
public class Main {
    public static void main(String[] args) {

        User user = new User.UserBuilder("Иван", "Иванов", "ivan@example.com")
                .setAddress("г. Москва, ул. Пушкина, д. 1").build();


    }
}//вариант 1
//Реализуйте паттерн "Строитель" для класса "Пользователь" (User), который позволяет задавать имя, фамилию, электронную почту и другие свойства пользователя.