package level1.exercise1;

public class NoGenericMethods<T> {
    private T obj1;
    private T obj2;
    private T obj3;

    public NoGenericMethods(T obj1, T obj2, T obj3) {
        this.obj1 = obj1;
        this.obj2 = obj2;
        this.obj3 = obj3;
    }
    public NoGenericMethods(T obj3, T obj1, T obj2, boolean notInOrder){
        this.obj1 = obj1;
        this.obj2 = obj2;
        this.obj3 = obj3;
    }

    public T getObj1() {
        return obj1;
    }
    public T getObj2() {
        return obj2;
    }
    public T getObj3() {
        return obj3;
    }

    public String toString() {
        return String.format("NoGenericMethods {\"%s\" \"%s\" \"%s\"}",
                obj1, obj2, obj3) + " Objetos de tipo: " +
                ((obj1 != null) ? obj1.getClass().getSimpleName() : "objetos vacíos.") + ".";
    }
}
//{1ro =\" %s \" - 2do =\" %s \" - 3ro =\" %s \"}"