import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

public abstract class Field {

    protected int coordinate;

    public Field (int coordinate){
        this.coordinate=coordinate;
    }
    private static int[][] Map;


    //das zu einem zwei Dimensionalem Array umstukturieren
    private static Map<Integer,EmptyField> createAllEmtpyTiles(){
        Map<Integer,EmptyField> emptyFieldMap = new HashMap<>();

        for(int i = 0;i<64;i++) {
            emptyFieldMap.put(i,new EmptyField(i));
        }

        return emptyFieldMap;
    }

    public abstract boolean isFull();

    public static final class EmptyField extends Field {

        EmptyField(int coordinate){
            super(coordinate);
        }

        public boolean isFull(){
            return false;
        }

    }

    public static final class FullField extends Field{

        FullField(int coordinate){
            super(coordinate);
        }

        public boolean isFull(){
            return true;
        }


    }


}
