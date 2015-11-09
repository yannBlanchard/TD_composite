import java.util.List;

/**
 * Created by yablanch on 09/11/2015.
 */
public class Composite<E> implements Component {
    public List<E> composant;

    @Override
    public boolean add(Object composant) {
        return false;
    }

    @Override
    public void remove(int i) {

    }

    @Override
    public int size() {
        return 0;
    }


//    public boolean add(E component){
//        composant.add(component);
//        return true;
//    }
}
