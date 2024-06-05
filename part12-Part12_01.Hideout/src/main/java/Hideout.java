public class Hideout<T> {
    private T hide;

//    public Hideout() {
//        this.hide = null;
//    }

    public void putIntoHideout (T toHide) {
        this.hide = toHide;
    }

    public T takeFromHideout() {
        T temp = hide;
        hide = null;

        return temp;
    }

    public boolean isInHideout() {
        return this.hide != null;
    }
}
