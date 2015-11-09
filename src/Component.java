/**
 * Created by yablanch on 09/11/2015.
 */
public interface Component<E> {
    boolean add(E composant);
    void remove(int i);
    int size();
}
