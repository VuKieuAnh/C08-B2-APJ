package manager;

import java.util.List;

public interface GeneralManager<T> {
    List<T> findAll();
    void save(T t);
    void delete(int index);
}
