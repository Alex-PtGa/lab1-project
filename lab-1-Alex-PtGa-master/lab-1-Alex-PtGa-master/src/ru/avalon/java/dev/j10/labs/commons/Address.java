/*
 * TODO(Студент): Создайте класс Address.
 *
 * 1. Добавте файл в пакет ru.avalon.java.dev.j10.labs.commons.+
 *
 * 2. Создайте класс, видимый из пакета. Подумайте о том
 *    Какое имя должен иметь класс, если он объявленн в этом
 *    файле.+
 *
 * 3. Подумайте над тем, какие переменные должены быть
 *    определены в классе.
 *
 * 4. Подумайте над тем, какие методы должны быть объявлены
 *    в классе.
 */
package ru.avalon.java.dev.j10.labs.commons;

public class Address {
    
    private String country, city, street;
    private int house, apartment;
    
public Address(String c, String ct, String st, int hs, int apt)   {
    c = country; 
    ct = city;
    st = street;
    hs = house;
    apt = apartment;
}
public Address(String c, String ct, String st)   {
    c = country; 
    ct = city;
    st = street;
 }

public String getCountry() {        return country;    }
      public void setCountry(String c) {        c=country;    }

public String getCity() {        return city;    }
      public void setCity(String ct) {        ct=city;    }

public String getStreet() {        return street;    }
      public void setStreet(String st) {        st=street;    }
      
public int getHouse() {        return house;    }
      public void setHouse(int hs) {        hs=house;    }

public int getApartment() {        return apartment;    }
      public void setAppartment(String  apt) {        apt = apartment;    }
 
}