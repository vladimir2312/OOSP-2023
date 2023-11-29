
public class Main {
    public static void main(String[] args) {
        Laboratory laboratory = new Laboratory();

        Patient patient1 = new Patient("Пациент 1");

        laboratory.addObserver(patient1);

        laboratory.setResults("Анализы пациента 1: хорошие");
        laboratory.setResults("Анализы пациента 1: плохие");

    }
}//5 вариант
//Создайте систему мониторинга здоровья, где пациенты могут подписываться на уведомления о результатах своих медицинских анализов.