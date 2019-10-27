package ru.avalon.java.dev.j10.labs.models;
import java.io.PrintStream;
import ru.avalon.java.dev.j10.labs.commons.*;
import java.util.*;
import java.lang.String;
/**
 * Представление о человеке.
 * <p>
 * С точки зрения задания человек представляется как сущность,
 * наделённая:
 * <ol>
 *     <li>именем;
 *     <li>паспортными данными;
 *     <li>пропиской по месту жительства.
 * </ol>
 */
public class Person {
    /*
     * TODO(Студент): Создайте класс Address.
     *
     * 1. Добавте файл в пакет ru.avalon.java.dev.j10.labs.commons.
     *
     * 2. Создайте класс, видимый из пакета. Подумайте о том
     *    Какое имя должен иметь класс, если он объявленн в этом
     *    файле.
     *
     * 3. Подумайте над тем, какие переменные должены быть
     *    определены в классе.
     *
     * 4. Подумайте над тем, какие методы должны быть объявлены
     *    в классе.
     */
    private String surname, name, patronymic, secondname;
    private Passport passport;
    private Address address;
    
   public Person(String s, String n, String p) {
        s = surname;             // 
        n = name;                //
        p = patronymic;         //
    }
      public String getSurName() {        return surname;    }
      public void setSurName(String s) {        s=surname;    }
      
      public String getName() {        return name;    }
      public void setName(String n) {        n=name;    }
      
      public String getPatronymic() {        return patronymic;    }
      public void setPatronymic(String p) {        p=patronymic;    }
      
      public String getSecondName() {        return secondname;    }
      public void setSecondName(String ns) {        ns=secondname;    }

      public Passport getPassport() {        return passport;    }
      public void setPassport(Passport pt) {        pt=passport;    }

      public Address getAddress() {        return address;    }
      public void setAddress(Address adr) {        adr=address;    }

    /**
     * Возврвщает полное имя человека.
     * <p>
     * Если у человека есть Имя, Фамилия и Отчество, то
     * возвращет Имя, Фимилию и Отчество, разделённые пробелом.
     * <p>
     * Если у человека нет Отчества, но есть второе имя, то
     * возвращает Имя, Первую букву второго имени, и Фамилию,
     * разделённые пробелом. После Инициала второго имени
     * должна стоять точка. Например, "Джером К. Джером".
     * <p>
     * Если у человека нет ни Отчества ни Второго имени, а
     * есть только Имя и Фамилия, то возвращает их, разделённые
     * пробелом.
     *
     * @return имя человека в виде строки.
     */
           
      String getfullName (String surname, String name, String patronymic, String secondname) {
       if(secondname == null) {
           System.out.println(name + " " + surname + " " + patronymic);
       }
       
       else if(patronymic == null) { 
           System.out.println(name + " " + secondname.charAt(0) + ". " + surname);
       }
       
       else if(secondname == null && patronymic == null) { 
           System.out.println(name + " " + surname);
       }
       
         /*
           * TODO(Студент): Закончить определение метода 'getFullName()' класса 'Person'
           */
        return surname + name + patronymic + secondname;
      }
    
    /**
     * Возвращает адрес, по которому проживает человек.
     * <p>
     * Возвращаемый адрес соответствует месту постоянной
     * регистрации человека, согласно паспортным данным.
     *
     * @param address
     * @return адрес регистрации в виде строки.
     */
    public Address getAddress(Address address) {
        /*
         * TODO(Студент): Закончить определение метода 'getAddress()' класса 'Person'
         */
        return address;
    }
}