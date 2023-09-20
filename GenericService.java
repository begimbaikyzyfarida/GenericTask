package Service;

import java.util.List;

public interface GenericService<T> {

    T getById(int id);
    void getAll();
    List<T> sortByName(int order);
    void clear();
}
