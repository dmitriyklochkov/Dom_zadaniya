package Zadanie6;

public interface TypeCollection<E> {

    int size(); // – возвращает размер коллекции


    <E> void add(E item); // – добавить элемент в коллекцию

    void remove(int index); // – удаляет элемент по индексу

    <E> void remove(E item); //– удаляет элемент


    Object get(int index);    // <E> get  (int index);// – получение элемента по индексу
    void clear(); // – очищает

}
