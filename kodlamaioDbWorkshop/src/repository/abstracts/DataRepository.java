package repository.abstracts;

import java.util.List;

public interface DataRepository<T> {

    List<T> getAll();
    void add(T t);
}
