package level1.exercise1;

public class NoGenericMethods {
    private Object obj1;
    private Object obj2;
    private Object obj3;

    public NoGenericMethods(Object obj1, Object obj2, Object obj3) {
        this.obj1 = obj1;
        this.obj2 = obj2;
        this.obj3 = obj3;
    }
    public NoGenericMethods(Object obj3, Object obj1, Object obj2, boolean notInOrder){
        this.obj1 = obj1;
        this.obj2 = obj2;
        this.obj3 = obj3;
    }

    public String toString() {
        return String.format("NoGenericMethods {\"%s\" - \"%s\" - \"%s\"}",
                obj1, obj2, obj3) + " Objetos de tipo: " +
                (((obj1 != null) ? obj1.getClass().getSimpleName() + ".":
                        ((obj2 != null) ? obj2.getClass().getSimpleName() + ".":
                                ((obj3 != null) ? obj3.getClass().getSimpleName() + "." :
                        "objetos vacíos.")))) ;
    }
}