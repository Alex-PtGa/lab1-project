package ru.avalon.java.dev.j10.labs.models;

import java.util.Calendar;

/**
 * Представление о паспортных данных человека.
 * <p>
 * Паспортные данные должны включать:
 * <ol>
 *  <li> серию и номер документа;
 *  <li> имя;
 *  <li> фамилию;
 *  <li> отчество;
 *  <li> второе имя;
 *  <li> день рождения;
 *  <li> дату выдачи;
 *  <li> орган, выдавший документ.
 * </ol>
 */
public class Passport {

    /**
     * TODO(Студент): Закончить определение класса.
     *
     * 1. Объявить атрибуты класса.
     *
     * 2. Определить необходимые методы класса. Подумайте о
     *    том, какие методы должны существовать в классе,
     *    чтобы обеспечивать получение всей необходимой
     *    информации о состоянии объектов данного класса.
     *    Все ли поля обязательно будут проинициализированы
     *    при создании экземпляра?
     *
     * 3. Создайте все необходимые конструкторы класса.
     *
     * 4. Помните о возможности существования перегруженных
     *    конструкторов.
     *
     * 5. Обеспечте возможность использования класса за
     *    пределами пакета.
     */
   
    private int pasSer, pasNum;   // серия и номер документа
    private String surname, name, patronymic, secondName;
    private Calendar dateBirth, dateExtradite;
    private String nameOrganization;
        
    public Passport(String n, String sn, String pt)    {
        n = name;
        sn = surname;
        pt = patronymic;
    }
    
    public Passport(int pasSer, int pasNum, String name, String surname, String patronymic, String sn, 
                      Calendar db, Calendar de, String no)    {
        this.pasSer = pasSer;
        this.pasNum = pasNum;
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        sn = secondName;
        db = dateBirth;
        de = dateExtradite;
        no = nameOrganization;
    }
        
    public int getPasSer() {        return pasSer;    }
      public void setPasSer(int pas) {        pas=pasSer;    }

    public int getPasNum() {        return pasNum;    }
      public void setPasNum(int pasn) {        pasn=pasNum;    }
    
    public String getName() {        return name;    }
      public void setName(String n) {        n=name;    }
      
    public String getSurName() {        return surname;    }
      public void setSurName(String sn) {        sn=surname;    }
   
    public String getPatronymic() {        return patronymic;    }
      public void setPatronymic(String pt) {        pt=patronymic;    }
         
    public String getSecondName() {        return secondName;    }
      public void setSecondName(String sn) {        sn=secondName;    }
      
    public Calendar getDateBirth() {        return dateBirth;    }
      public void setDateBirth(Calendar db) {        db=dateBirth;    }
      
    public Calendar getDateExtradite() {        return dateExtradite;    }
      public void setDateExtradite(Calendar de) {        de=dateExtradite;    }
    
    public String getNameOrganization() {        return nameOrganization;    }
      public void setNameOrganization(String no) {        no=nameOrganization;    }
}
