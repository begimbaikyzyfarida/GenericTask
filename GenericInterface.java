import Model.Animal;
import Model.Person;
import Service.GenericService;

import java.util.*;
import java.util.concurrent.Callable;

public class GenericInterfaceImpl<T> implements GenericService<T> {


    private List<T> data;


    public GenericInterfaceImpl(List<T> data) {
        this.data = data;
    }



    @Override
    public T getById(int id) {
        for (T element : data) {
            if (element instanceof Model.Person) {
                Person person = (Person) element;
                if (person.getInstanceId()==(id)) {
                    return (T) person;
                }
            } else if (element instanceof Model.Animal) {
                Animal animal = (Animal) element;
                if (animal.getInstanceId()==(id)) {
                    return (T) animal;
                }
            }
        }
        return null;
    }


    @Override
    public void getAll() {
        for(T t:data){
            System.out.println(t);
        }
    }

    @Override
    public List<T> sortByName(int order) {
        Collections.sort(data, new Comparator<T>() {
            @Override
            public int compare(T o1, T o2) {
                String name1 = getName(o1);
                String name2 = getName(o2);
                return (order == 1) ? name1.compareTo(name2) : name2.compareTo(name1);
            }
            private String getName(T data) {
                if (data instanceof Model.Person) {
                    return ((Person) data).getName();
                } else if (data instanceof Model.Animal) {
                    return ((Animal) data).getName();
                }
                return "";
            }
        });
        return data;
    }



    @Override
    public void clear() {
        System.out.println("Cleared Elements:");
        for (T element : data) {
            System.out.println(element);
        }
        data.clear();
    }
}


