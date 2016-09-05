import java.util.*;

public class Factory<E> {
    public Set<E> setInterfaz(int opcion1){
        Set<E> lista = null;
        if (opcion1 == 1)
            lista = new HashSet<>();
        if (opcion1 == 2)
            lista = new TreeSet<>();
        if (opcion1 == 3)
            lista = new LinkedHashSet<>();
        return lista;
    }
}
